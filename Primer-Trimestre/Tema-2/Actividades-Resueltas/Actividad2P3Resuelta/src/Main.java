import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        num2 = sc.nextInt();

        if(num1 > num2) System.out.println(num1 + " es mayor que " + num2);
        else System.out.println(num2 + " es mayor que " + num1);
    }
}