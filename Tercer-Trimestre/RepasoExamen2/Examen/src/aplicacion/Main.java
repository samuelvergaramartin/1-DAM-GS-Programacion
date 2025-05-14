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
                    sc = new Scanner(System.in);
                    sc.useLocale(Locale.US);
                    String tipoBarco;
                    double longitud;
                    boolean insertado;
                    Barco barco;

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
                        insertado = flota.insertarBarco(barco);
                    }
                    else {
                        barco = new Submarino(longitud);
                        insertado = flota.insertarBarco(barco);
                    }

                    if(insertado) {
                        System.out.println("Se ha insertado el barco correctamente");
                        System.out.println(barco);
                    }
                    else System.out.println("Error: No se ha podido insertar el barco.");

                    break;
                }
                case 2: {
                    //Opcion 2
                    break;
                }
                case 3: {
                    //Opcion 3
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
                0- Salir
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}