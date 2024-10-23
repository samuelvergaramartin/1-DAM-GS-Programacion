import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introducza un número: ");
        num = sc.nextInt();

        while(num < 0 && num % 5 != 0) {
            System.out.print("Introducza un número: ");
            num = sc.nextInt();
        }
    }
}