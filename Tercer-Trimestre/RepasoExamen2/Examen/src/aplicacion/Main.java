package aplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    //Opcion 1
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