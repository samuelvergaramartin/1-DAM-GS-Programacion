import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zona principal, compraVenta, vip;
        final String menu = """
                Menu
                ----
                1- Mostrar número de entradas libres
                2- Vender entradas
                3- Salir
                """;
        Scanner sc;
        int opcion;

        principal = new Zona(1000);
        compraVenta = new Zona(200);
        vip = new Zona(25);

        do {
            sc = new Scanner(System.in);
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Número de entradas libres en la sala principal: " + principal.getEntradasPorVender());
                    System.out.println("Número de entradas libres en la sala Compra-Venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Número de entradas libres en la sala Vip: " + vip.getEntradasPorVender());
                    break;
                }
                case 2: {
                    sc = new Scanner(System.in);
                    final String sala;
                    final int numEntradas;

                    System.out.print("Introduzca el nombre de la sala de la que deseas adquirir entradas: ");
                    sala = sc.nextLine();
                    if(salaValida(sala)) {
                        System.out.print("Introduzca el número de entradas a adquirir: ");
                        numEntradas = sc.nextInt();

                        switch (sala.toLowerCase()) {
                            case "principal": {
                                principal.vender(numEntradas);
                                break;
                            }
                            case "compra-venta": {
                                compraVenta.vender(numEntradas);
                                break;
                            }
                            case "vip": {
                                vip.vender(numEntradas);
                                break;
                            }
                        }
                    }
                    else System.out.println("Error: La sala introducida no existe.");

                    break;
                }
                case 3: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida.");
                    break;
                }
            }
        }
        while (opcion != 3);
    }

    private static boolean salaValida(final String sala) {
        return sala.equalsIgnoreCase("principal") || sala.equalsIgnoreCase("compra-venta") || sala.equalsIgnoreCase("vip");
    }
}