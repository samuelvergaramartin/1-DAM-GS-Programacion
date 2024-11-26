import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número positivo: ");
            num = sc.nextInt();
        }
        while (num < 0);

        muestraPares(num);
    }

    private static void muestraPares(int n) {
        for(int i = 2; i <= 2*n; i+=2) {
            System.out.println(i);
        }
    }
}