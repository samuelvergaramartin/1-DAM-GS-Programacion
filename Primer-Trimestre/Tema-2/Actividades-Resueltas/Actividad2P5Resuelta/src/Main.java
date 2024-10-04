import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, mayor, menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        mayor = num1 >= num2 ? num1 : num2;
        menor = mayor == num1 ? num2 : num1;

        System.out.println(mayor);
        System.out.println(menor);
    }
}