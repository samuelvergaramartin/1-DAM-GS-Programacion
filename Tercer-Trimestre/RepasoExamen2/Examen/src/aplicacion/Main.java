package aplicacion;

import coleccion.Flota;
import embarcaciones.Acorazado;
import embarcaciones.Barco;
import embarcaciones.Submarino;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc;
        Flota flota = new Flota();

        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    boolean insertado = insertarBarco(flota);

                    if(insertado) {
                        System.out.println("Se ha insertado el barco correctamente");
                        System.out.println(flota.arrayBarcos()[flota.numeroElementos() - 1]);
                    }
                    else System.out.println("Error: No se ha podido insertar el barco.");

                    break;
                }
                case 2: {
                    boolean eliminado = eliminarBarco(flota);

                    if(eliminado) System.out.println("Se ha eliminado el barco correctamente.");
                    else System.out.println("Error: No se ha podido eliminar el barco. No existe en la flota.");

                    break;
                }
                case 3: {
                    System.out.println("Mostrando acorazados por orden de insercción");
                    for(Barco barco : flota.arrayBarcos()) {
                        if(barco instanceof Acorazado) System.out.println(barco);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Motrando todos los barcos de la flota");
                    System.out.println(flota);
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción inválida.");
                    break;
                }
            }
        }
        while (opcion != 0);
    }

    private static int menu() {
        final String MENU = """
                Menu
                1- Insertar barco
                2- Eliminar barco
                3- Mostrar acorazados por orden de insercción
                4- Mostrar todos los barcos de la flota
                0- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }

    private static boolean insertarBarco(Flota flota) {
        return flota.insertarBarco(pedirDatosBarco(flota));
    }

    private static boolean eliminarBarco(Flota flota) {
       return flota.eliminarBarco(pedirDatosBarco(flota));
    }

    private static Barco pedirDatosBarco(Flota flota) {
        Scanner sc = new Scanner(System.in);
        String tipoBarco;
        double longitud;
        Barco barco;

        sc.useLocale(Locale.US);

        do {
            System.out.print("Introduzca el tipo de barco (Acorazado o Submarino): ");
            tipoBarco = sc.nextLine();
        }
        while (!tipoBarco.equalsIgnoreCase("acorazado") && !tipoBarco.equalsIgnoreCase("submarino"));

        do {
            System.out.print("Introduzca la longitud del barco: ");
            longitud = sc.nextDouble();
        }
        while (longitud < 0);

        if(tipoBarco.equalsIgnoreCase("acorazado")) {
            int numCaniones;
            do {
                System.out.print("Introduzca el número de cañones: ");
                numCaniones = sc.nextInt();
            }
            while (numCaniones < 0);
            barco = new Acorazado(longitud, numCaniones);
        }
        else barco = new Submarino(longitud);

        return barco;
    }
}