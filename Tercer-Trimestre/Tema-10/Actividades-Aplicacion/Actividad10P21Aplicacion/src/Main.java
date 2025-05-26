import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Agenda agenda = new Agenda();

        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    boolean agregado = nuevoContacto(agenda);

                    if (agregado) System.out.println("Se ha agregado el contacto satisfactoriamente.");
                    else System.out.println("Error: El contacto ya está registrado.");

                    break;
                }
                case 2: {
                    System.out.println(buscarContactoPorNombre(agenda));
                    break;
                }
                case 3: {
                    System.out.println(obtenerContactos(agenda));
                    break;
                }
                case 4: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida.");
                    break;
                }
            }
        }
        while (opcion != 4);
    }

    private static int menu() {
        final String MENU = """
                Menú de opciones
                1- Nuevo contacto
                2- Buscar por nombre
                3- Mostrar todos los contactos
                4- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Seleccione una opcion: ");

        return sc.nextInt();
    }

    private static boolean nuevoContacto(Agenda agenda) {
        String nombre, telefono;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del nuevo contacto: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese el telefono del nuevo contacto: ");
        telefono = sc.nextLine();

        return agenda.agregarContacto(new Contacto(nombre, telefono));
    }

    private static String buscarContactoPorNombre(Agenda agenda) {
        String busqueda, resultado = "", telefonos[];
        Scanner sc = new Scanner(System.in);

        System.out.print("Buscar: ");
        busqueda = sc.nextLine();

        telefonos = agenda.buscarPorNombre(busqueda);

        for(String telefono : telefonos) {
            resultado += agenda.obtenerContacto(telefono).toString();
        }

        return resultado;
    }

    private static String obtenerContactos(Agenda agenda) {
        final Collection<Contacto> CONTACTOS = agenda.obtenerContactos();
        String contactos = "";

        for (Contacto contacto : CONTACTOS) {
            contactos += contacto.toString();
        }

        return contactos;
    }
}