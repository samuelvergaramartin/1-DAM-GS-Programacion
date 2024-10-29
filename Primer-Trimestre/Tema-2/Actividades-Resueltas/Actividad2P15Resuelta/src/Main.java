import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = i; j <= num;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}