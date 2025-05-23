import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    boolean introducido = introducirTemperatura();

                    if(introducido) System.out.println("Temperatura introducida correctamente.");
                    else System.out.println("Error: La temperatura introducida no debe estar repetida en el mes introducido.");

                    break;
                }
                case 2: {
                    boolean eliminado = eliminarMes();

                    if (eliminado) System.out.println("Mes eliminado correctamente.");
                    else System.out.println("Error: El mes introducido no estaba registrado.");

                    break;
                }
                case 3: {
                    boolean eliminadas = eliminarTemperaturasMes();

                    if(eliminadas) System.out.println("Temperaturas del mes eliminadas correctamente.");
                    else System.out.println("Error: El mes introducido no estaba registrado o no tenía temperaturas registradas.");

                    break;
                }
                case 4: {
                    System.out.println(Temperaturas.meses());
                    break;
                }
                case 5: {
                    System.out.println(mesesTemperaturaMayor());
                    break;
                }
                case 6: {
                    System.out.println(Temperaturas.datosTemperaturas());
                    break;
                }
                case 7: {
                    System.out.println(Temperaturas.datosTemperaturasOrdenadas());
                    break;
                }
                case 8: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción inválida.");
                    break;
                }
            }
        }
        while (opcion != 8);
    }
    private static int menu() {
        final String MENU = """
                Menu
                1- Introducir temperatura
                2- Eliminar mes
                3- Eliminar temperaturas mes
                4- Meses introducidos
                5- Meses temperatura superior
                6- Mostrar datos
                7- Mostrar datos temperaturas ordenadas
                8- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Selecciona una opción: ");

        return sc.nextInt();
    }

    private static boolean introducirTemperatura() {
        Scanner sc = new Scanner(System.in);
        String mes;
        int temperatura;

        System.out.print("Introduce el mes: ");
        mes = sc.nextLine();

        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextInt();

        return Temperaturas.introducirTemperatura(mes, temperatura);
    }

    private static boolean eliminarMes() {
        Scanner sc = new Scanner(System.in);
        String mes;

        System.out.print("Introduce el mes: ");
        mes = sc.nextLine();

        return Temperaturas.eliminarMes(mes);
    }

    private static String mesesTemperaturaMayor() {
        Scanner sc = new Scanner(System.in);
        int temperatura;

        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextInt();

        return Temperaturas.mesesTemperaturaMayor(temperatura).toString();
    }

    private static boolean eliminarTemperaturasMes() {
        Scanner sc = new Scanner(System.in);
        String mes;

        System.out.print("Introduce el mes: ");
        mes = sc.nextLine();

        return Temperaturas.eliminarTemperaturasMes(mes);
    }
}