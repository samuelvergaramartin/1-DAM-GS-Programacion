import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            factorial*=i;
        }

        System.out.println(factorial);
    }
}