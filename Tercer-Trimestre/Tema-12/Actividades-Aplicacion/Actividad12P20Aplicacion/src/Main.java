import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SuperCola<Integer> superCola = new SuperCola<>();
        Scanner sc;
        int opcion, numero;

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    sc = new Scanner(System.in);
                    System.out.print("Introduce el número a encolar: ");
                    numero = sc.nextInt();
                    superCola.encolar(numero);

                    System.out.println("Número encolado correctamente.");

                    System.out.println(superCola);
                    break;
                }
                case 2: {
                    sc = new Scanner(System.in);
                    System.out.print("Introduce el número a encolar: ");
                    numero = sc.nextInt();
                    superCola.encolar2(numero);

                    System.out.println("Número encolado correctamente.");

                    System.out.println(superCola);
                    break;
                }
                case 3: {
                    Integer desencolado = superCola.desencolar1();

                    if(desencolado != null) {
                        System.out.println("Se ha desencolado correctamente");
                    }
                    else System.out.println("Error: La supercola está vacia.");

                    System.out.println(superCola);
                    break;
                }
                case 4: {
                    Integer desencolado = superCola.desencolar2();

                    if(desencolado != null) {
                        System.out.println("Se ha desencolado correctamente");
                    }
                    else System.out.println("Error: La supercola está vacia.");

                    System.out.println(superCola);
                    break;
                }
                case 5: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida.");

                    break;
                }
            }
        }
        while (opcion != 5);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu
                1- Encolar en cola1
                2- Encolar en cola2
                3- Desencolar de cola1
                4- Desencolar de cola2
                5- Salir
                """;
        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}