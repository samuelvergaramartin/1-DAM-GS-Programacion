import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        result = (num < 0) ? (num*-1) : num;

        System.out.println("El numero absoluto de " + num + " es " + result);
    }
}