package principal;

import superclases.Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String menu = """
                VEHÍCULOS
                =========
                1- Anda con la bicicleta
                2- Haz el caballito con la bicicleta
                3- Anda con el coche
                4- Quema rueda con el coche
                5- Ver kilometraje de la bicicleta
                6- Ver kilometraje del coche
                7- Ver kilometraje total
                8- Salir
                """;
        Scanner sc = new Scanner(System.in);
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        int opcion;
        double km;

        do {
            System.out.println(menu);
            System.out.print("Elige una opción (1-8): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    bici.andar();
                    System.out.println("Has andado con la bicicleta.");
                    break;
                }
                case 2: {
                    bici.hacerCaballito();
                    System.out.println("Has hecho el caballito con la bicicleta.");
                    break;
                }
                case 3: {
                    coche.andar();
                    System.out.println("Has andado con el coche.");
                    break;
                }
                case 4: {
                    coche.quemarRueda();
                    System.out.println("Has quemado rueda con el coche.");
                    break;
                }
                case 5: {
                    km = bici.getKilometrosRecorridos();
                    System.out.println("Has recorrido " + km + (km == 1 ? " kilómetro" : " kilómetros") + " en bicicleta");
                    break;
                }
                case 6: {
                    km = coche.getKilometrosRecorridos();
                    System.out.println("Has recorrido " + km + (km == 1 ? " kilómetro" : " kilómetros") + " en coche");
                    break;
                }

                case 7: {
                    km = Vehiculo.getKilometrosTotales();
                    System.out.println("Has recorrido " + km + (km == 1 ? " kilómetro" : " kilómetros") + " en total");
                    break;
                }
                case 8: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida.");
                    break;
                }
            }
        }
        while (opcion != 8);
    }
}