package principal;

import ejercito.Ejercito;
import tablero.Tablero1D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        int opcion;
        Ejercito ejercito1 = new Ejercito(), ejercito2 = new Ejercito();
        Tablero1D tablero = new Tablero1D();

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    System.out.println(ejercito1);
                    System.out.println(ejercito2);
                    break;
                }
                case 2: {
                    tablero.colocarPersonajes(ejercito1, ejercito2);
                    System.out.println(tablero);
                    break;
                }
                case 3: {
                    //Opcion 3
                    break;
                }
                case 4: {
                    //Opcion 4
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida.");
                    break;
                }
            }

        }
        while (opcion != 0);

    }
    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                MENÚ
                1. Mostrar ejércitos
                2. Mostrar tablero
                3. Ataca ejercito 1
                4. Ataca ejercito 2
                0. Salir
                """;
        System.out.println(MENU);
        System.out.print("Introduce una opcion: ");

        return sc.nextInt();
    }
}