package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String MENU = """
                Menu
                1- Encolar en cola1
                2- Encolar en cola2
                3- Desencolar de cola1
                4- Desencolar de cola2
                5- Salir
                """;
        Scanner sc;
        SuperCola superCola = new SuperCola();
        int opcion;

        do {
            sc = new Scanner(System.in);
            System.out.println(MENU);
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Introduce el numero a encolar: ");
                    superCola.encolar1(sc.nextInt());
                    break;
                }
                case 2: {
                    System.out.print("Introduce el numero a encolar: ");
                    superCola.encolar2(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("Desencolando de la cola 1...");
                    System.out.println("Número desencolado: " + superCola.desencolar1());
                    break;
                }
                case 4: {
                    System.out.println("Desencolando de la cola 3...");
                    System.out.println("Número desencolado: " + superCola.desencolar2());
                    break;
                }
                case 5: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida.");
                    break;
                }
            }

            System.out.println("Estado de la supercola:\n " + superCola);
        }
        while (opcion != 5);
    }
}