import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        String iguales;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        iguales = num1 == num2 ? "Son iguales" : "No son iguales";

        System.out.println(iguales);
    }
}