import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        while(num != 0) {
            if (num %2 == 0) System.out.println("Es par");
            else System.out.println("Es impar");

            if(num > 0) System.out.println("Es positivo");
            else System.out.println("Es negativo.");

            System.out.println("El cuadrado de " + num + " es " + Math.pow(num, 2));

            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        }
    }
}