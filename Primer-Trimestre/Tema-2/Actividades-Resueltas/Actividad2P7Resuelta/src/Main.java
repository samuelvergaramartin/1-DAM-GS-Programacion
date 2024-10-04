import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();



        if(num1 > num2 && num1 > num3) System.out.println(num1);
        else if (num2 > num1 && num2 > num3) System.out.println(num2);
        else System.out.println(num3);
    }
}