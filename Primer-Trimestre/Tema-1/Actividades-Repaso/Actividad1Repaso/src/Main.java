import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        num2 = sc.nextInt();

        result = num1 * num2;

        System.out.println(num1 + " X " + num2 + " = " + result);
    }
}