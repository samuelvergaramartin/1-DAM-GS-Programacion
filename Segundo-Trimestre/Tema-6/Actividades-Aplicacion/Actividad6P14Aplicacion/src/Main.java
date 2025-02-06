import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contactos[][] = new String[2][0];
        final String menu = """
                \tMenu de la agenda
                1- Añadir nuevo contacto (nombre y teléfono)
                2- Buscar teléfono de un contacto a través de su nombre
                3- Mostrar todos los contactos ordenador alfabeticamente por el nombre.
                4- Salir 
                """;
        int opcion;

        do {
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Opcion 1");
                    break;
                }
                case 2: {
                    System.out.println("Opcion 2");
                    break;
                }
                case 3: {
                    System.out.println("Opcion 3");
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
        }
        while (opcion != 4);
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
}