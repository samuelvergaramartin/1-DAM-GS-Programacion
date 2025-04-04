import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Socio> socios = new TreeMap<>();
        Scanner sc;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    String apodo, nombre, fechaIngreso;
                    sc = new Scanner(System.in);

                    do {
                        System.out.print("Introduzca el apodo del nuevo socio");
                        apodo = sc.nextLine();
                    }
                    while (socios.containsKey(apodo));

                    System.out.print("Introduzca el nombre del nuevo socio: ");
                    nombre = sc.nextLine();

                    System.out.print("Introduzca la fecha de ingreso del nuevo socio: ");
                    fechaIngreso = sc.nextLine();

                    try {
                        socios.put(apodo, new Socio(apodo, nombre, fechaIngreso));

                        System.out.println("Se ha dado de alta correctmente al socio.");
                    }
                    catch (DateTimeParseException ex) {
                        System.out.println("Error: El formato de la fecha introducida no es válido.");
                    }

                    break;
                }
                case 2: {
                    String apodo;
                    sc = new Scanner(System.in);

                    System.out.print("Introduzca el apodo del socio: ");
                    apodo = sc.nextLine();

                    if(!socios.containsKey(apodo)) {
                        System.out.println("Error: El socio no está dado de alta en el club.");
                    }
                    else {
                        socios.remove(apodo);
                        System.out.println("Se ha dado de baja correctamente al socio.");
                    }

                    break;
                }
                case 3: {
                    String apodo, nombre, fechaIngreso;

                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida.");
                    break;
                }
            }
        }
        while (opcion != 7);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu
                1- Dar de alta a un socio
                2- Dar de baja a un socio
                3- Modificar a un socio
                4- Listar socios por apodo
                5- Listar socios por antigüedad
                6- Listar los socios con alta anterior a un año determinado
                7- Salir
                """;

        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}