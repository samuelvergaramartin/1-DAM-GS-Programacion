import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean encontrado;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        encontrado = num % 2 == 0;

        while (!encontrado) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();

            encontrado = num % 2 == 0;
        }

        System.out.println("Fin del programa");
    }
}