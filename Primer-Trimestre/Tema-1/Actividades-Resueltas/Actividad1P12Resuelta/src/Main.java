import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        System.out.println("El numero absoluto de " + num + " es " + Math.abs(num));
    }
}