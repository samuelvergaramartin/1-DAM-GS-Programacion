import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, mcd = 1, mayor, menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();

        mayor = Math.max(num1, num2);
        menor = Math.min(num1, num2);

        for (int i = menor; i > 1; i--) {
            if(mayor % i == 0 && menor % i == 0) mcd = i;
        }

        System.out.println(mcd);
    }
}