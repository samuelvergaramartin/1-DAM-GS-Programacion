import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion, num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    MENÚ DE OPCIONES
                    1.- Cuadrado de un número
                    2.- Raíz de un número (con 2 decimales)
                    3.- Módulo de 5 de un número
                    4.- Salir""");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.println("El cuadrado de " +  num + " es " + (int) Math.pow(num, 2));
                    break;
                }
                case 2: {
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.printf("La raíz cuadrada de %d es %.2f \n", num, Math.sqrt(num));
                    break;
                }
                case 3: {
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.println("El módulo de 5 de " +  num + " es " + (num % 5));
                    break;
                }
                case 4: {
                    System.out.println("Fin del programa");
                    break;
                }
                default: {
                    System.out.println("La opción introducida es incorrecta.");
                    break;
                }
            }
        }
        while (opcion != 4);
    }
}