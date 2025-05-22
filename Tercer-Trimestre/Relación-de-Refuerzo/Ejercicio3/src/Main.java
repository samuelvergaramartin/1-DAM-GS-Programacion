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
                    else System.out.println("Error: La temperatura introducida debe ser mayor que la establecida para dicho mes.");

                    break;
                }
                case 2: {
                    boolean eliminado = eliminarMes();

                    if (eliminado) System.out.println("Mes eliminado correctamente.");
                    else System.out.println("Error: El mes introducido no estaba registrado.");

                    break;
                }
                case 3: {
                    System.out.println(TemperaturasMaximas.meses());
                    break;
                }
                case 4: {
                    System.out.println(mesesTemperaturaMayor());
                    break;
                }
                case 5: {
                    System.out.println(TemperaturasMaximas.datosTemperaturas());
                    break;
                }
                case 6: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción inválida.");
                    break;
                }
            }
        }
        while(opcion != 6);
    }

    private static int menu() {
        final String MENU = """
                Menu
                1- Introducir temperatura
                2- Eliminar mes
                3- Meses introducidos
                4- Meses temperatura mayor
                5- Datos temperaturas
                6- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Selecciona una opción: ");

        return sc.nextInt();
    }

    private static boolean introducirTemperatura() {
        Scanner sc = new Scanner(System.in);
        Meses mes;
        int temperatura;

        mes = pedirMes();

        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextInt();

        return TemperaturasMaximas.introducirTemperatura(mes, temperatura);
    }

    private static boolean eliminarMes() {
        return TemperaturasMaximas.eliminarMes(pedirMes());
    }

    private static String mesesTemperaturaMayor() {
        Scanner sc = new Scanner(System.in);
        int temperatura;

        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextInt();

        return TemperaturasMaximas.mesesTemperaturaMayor(temperatura).toString();
    }

    private static Meses pedirMes() {
        Scanner sc = new Scanner(System.in);
        String mes;
        boolean valido = false;

        do {
            System.out.print("Introduce el mes: ");
            mes = sc.nextLine();

            switch(mes.toUpperCase()) {
                case "ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE": {
                    valido = true;
                    break;
                }
            }
        }
        while(!valido);

        return Meses.valueOf(mes.toUpperCase());
    }
}