import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contactos[][] = new String[2][0], nombre = "", telefono = "", listado;
        final String menu = """
                \tMenu de la agenda
                1- Añadir nuevo contacto (nombre y teléfono)
                2- Buscar teléfono de un contacto a través de su nombre
                3- Mostrar todos los contactos ordenados alfabeticamente por el nombre.
                4- Salir 
                """;
        int opcion;

        do {
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc = new Scanner(System.in);

            switch (opcion) {
                case 1: {
                    do {
                        System.out.print("Introduce el nombre del nuevo contacto: ");
                        nombre = sc.nextLine();
                        sc = new Scanner(System.in);
                    }
                    while (nombre.isBlank());

                    if(nombreRegistrado(contactos, nombre)) {
                        System.out.println("Error: El nombre introducido ya está registrado en la lista de contactos");
                    }
                    else {
                        do {
                            System.out.print("Introduce el número de teléfono del nuevo contacto: ");
                            telefono = sc.nextLine();
                            sc = new Scanner(System.in);
                        }
                        while (telefono.isBlank());

                        if(telefonoRegistrado(contactos, telefono)) {
                            System.out.println("Error: El número de teléfono introducido ya pertenece a un contacto");
                        }
                        else {
                            contactos = agregarContacto(contactos, nombre, telefono);

                            System.out.println("Contacto agregado satisfactoriamente!");
                        }
                    }

                    break;
                }
                case 2: {
                    do {
                        System.out.print("Introduce el nombre del contacto: ");
                        nombre = sc.nextLine();
                        sc = new Scanner(System.in);
                    }
                    while (nombre.isBlank());

                    telefono = buscarTelefono(contactos, nombre);

                    if(telefono.isBlank()) System.out.println("Error: No existe ningún contacto con ese nombre");
                    else System.out.println("El número de teléfono de " + nombre + " es " +  telefono);

                    break;
                }
                case 3: {
                    listado = obtenerListadoOrdenadoPorNombre(contactos);

                    if(listado.isBlank()) System.out.println("No hay contactos registrados");
                    else System.out.println(listado);

                    break;
                }
                case 4: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida.");
                    break;
                }
            }

            System.out.println();
        }
        while (opcion != 4);
    }

    private static boolean telefonoRegistrado(String contactos[][], String telefono) {
        boolean encontrado = false;
        int i = 0;

        while (i < contactos[1].length && !encontrado) {
            if(contactos[1][i].equals(telefono)) encontrado = true;
            i++;
        }

        return encontrado;
    }

    private static boolean nombreRegistrado(String contactos[][], String nombre) {
        boolean encontrado = false;
        int i = 0;

        while (i < contactos[0].length && !encontrado) {
            if(contactos[0][i].equals(nombre)) encontrado = true;
            i++;
        }

        return encontrado;
    }

    public static String[][] agregarContacto(String contactos[][], String nombre, String telefono) {
        String resultado[][] = new String[2][contactos[0].length + 1];

        if(contactos[0].length > 0) {
            System.arraycopy(contactos[0], 0, resultado[0], 0, contactos[0].length);
            System.arraycopy(contactos[1], 0, resultado[1], 0, contactos[1].length);
        }

        resultado[0][resultado[0].length - 1] = nombre;
        resultado[1][resultado[1].length - 1] = telefono;

        return resultado;
    }

    private static String buscarTelefono(String contactos[][], String nombre) {
        String telefono = "";
        int i = 0;

        while (i < contactos[0].length && telefono.isBlank()) {
            if(contactos[0][i].equals(nombre)) telefono = contactos[1][i];
            i++;
        }

        return telefono;
    }

    private static String obtenerListadoOrdenadoPorNombre(String contactos[][]) {
        String resultado = "";
        String nombresOrdenados[] = new String[contactos[0].length];

        if(contactos[0].length > 0) {
            resultado = "\tLista de contactos\n";

            System.arraycopy(contactos[0], 0, nombresOrdenados, 0, contactos[0].length);
            Arrays.sort(nombresOrdenados);
            for(int i = 0; i < nombresOrdenados.length; i++) {
                resultado+= nombresOrdenados[i] + " - " + buscarTelefono(contactos, nombresOrdenados[i]) + "\n";
            }
        }

        return resultado;
    }
}