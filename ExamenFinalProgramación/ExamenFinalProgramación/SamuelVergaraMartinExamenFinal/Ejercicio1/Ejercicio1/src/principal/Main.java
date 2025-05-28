package principal;

import alumnos.Alumnado;
import alumnos.AlumnadoNEAE;
import notas.NotaAlumnado;

import java.util.Iterator;
import java.util.Set;

public class Main {

    public static int menu() {

        int opcion = 0;

        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Introducir alumnado");
            System.out.println("2. Eliminar alumnado");
            System.out.println("3. Introducir nota de alumno/a");
            System.out.println("4. Mostrar información (sin notas) de todos los alumnos del grupo");
            System.out.println("5. Mostrar todas las notas de un alumno");
            System.out.println("6. Mostrar el nombre de todos los alumnos NEAE");
            System.out.println("0. Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");
        } while ((opcion < 0) || (opcion > 6));

        return opcion;
    }




    public static void main(String[] args) {

        int opcion = 0;
        GrupoAlumnado grupoAlumnado = new GrupoAlumnado();


        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    boolean introducido = introducirAlumnado(grupoAlumnado);

                    if (introducido) System.out.println("El alumno se ha inscrito correctamente.");
                    else System.out.println("Error: No se ha podido inscribir al alumno.");
                }
                case 2 -> {
                    boolean eliminado = eliminarAlumnado(grupoAlumnado);

                    if (eliminado) System.out.println("El alumno se ha eliminado correctamente.");
                    else System.out.println("Error: No se ha podido eliminar al alumno, no estaba inscrito.");
                }
                case 3 -> {
                    boolean introducida = introducirNotaAlumno(grupoAlumnado);

                    if(introducida) System.out.println("Se ha insertado correctamente la nota.");
                    else System.out.println("Error: No se ha podido insertar  la nota debido a que el alumno no está inscrito o porque la nota ya está registrada.");
                }
                case 4 -> {
                    System.out.println(grupoAlumnado);
                }
                case 5 -> {
                    System.out.println(obtenerTodasNotasAlumno(grupoAlumnado));
                }
                case 6 -> {
                    System.out.println(obtenerNombresNEAEConNota(grupoAlumnado));
                }
            }

        } while (opcion != 0);

    }

    private static boolean introducirAlumnado(GrupoAlumnado grupoAlumnado) {
        boolean introducido;
        String nombre, neae;

        do {
            nombre = EntradaTeclado.pedirCadena("Introduce el nombre: ");
        }
        while (nombre.isBlank());

        do {
            neae = EntradaTeclado.pedirCadena("¿El alumno es NEAE? (s/n): ");
        }
        while (!neae.equalsIgnoreCase("s") && !neae.equalsIgnoreCase("n"));

        if(neae.equalsIgnoreCase("s")) {
            double coeficiente = EntradaTeclado.pedirDouble("Introduzca el coeficiente: ");
            introducido = grupoAlumnado.inscribirAlumno(new AlumnadoNEAE(nombre, coeficiente));
        }
        else introducido = grupoAlumnado.inscribirAlumno(new Alumnado(nombre));

        return introducido;
    }

    private static boolean eliminarAlumnado(GrupoAlumnado grupoAlumnado) {
        boolean eliminado = false;
        int nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");
        Alumnado alumno = grupoAlumnado.encontrarPorNie(nie);

        if (alumno != null) {
            eliminado = grupoAlumnado.eliminarAlumno(alumno);
            if(eliminado) NotaAlumnado.eliminarTodasNotasAlumnado(nie);
        }

        return eliminado;
    }

    private static boolean introducirNotaAlumno(GrupoAlumnado grupoAlumnado) {
        boolean introducida = false;
        int nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");
        String fecha;
        double nota;
        Alumnado alumno = grupoAlumnado.encontrarPorNie(nie);

        if (alumno != null) {
            fecha = EntradaTeclado.pedirCadena("Introduzca la fecha: ");
            nota = EntradaTeclado.pedirDouble("Introduzca la nota: ");

            introducida = grupoAlumnado.insertarNotaAlumnado(nie, new NotaAlumnado(fecha, nota));
        }

        return introducida;
    }

    private static String obtenerTodasNotasAlumno(GrupoAlumnado grupoAlumnado) {
        String resultado = "";
        int nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");
        Iterator<NotaAlumnado> notas = NotaAlumnado.notasAlumnado(nie);

        if(notas != null) {
            while (notas.hasNext()) {
                resultado += notas.next().toString() + "\n";
            }
        }

        return resultado;
    }

    private static String obtenerNombresNEAEConNota(GrupoAlumnado grupoAlumnado) {
        Set<Integer> nies = NotaAlumnado.codigosAlumnado();
        String resultado = "";

        for(Integer nie: nies) {
            //Aqui no compruebo si el metodo encontrarPorNie me devuelve null porque ya me lo hace el metodo alumnosConNotas
            if(NotaAlumnado.alumnoConNotas(nie) && grupoAlumnado.encontrarPorNie(nie) instanceof AlumnadoNEAE) {
                resultado += grupoAlumnado.encontrarPorNie(nie).getNombre() + "\n";
            }
        }

        return resultado;
    }
}
