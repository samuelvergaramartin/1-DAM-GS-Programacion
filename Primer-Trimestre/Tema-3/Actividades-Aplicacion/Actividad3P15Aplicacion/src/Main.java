import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, result;
        //m = columna
        //n = fila
        //E(n,m) = (n!/(m!*(n-m)!))
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                result = (factorial(i)) / (factorial(j) * factorial(i-j));
                System.out.print(result);
            }
            System.out.println();
        }
    }

    private static int factorial(int num) {
        int result = 1;

        for(int i = 1; i <= num; i++) {
            result*=i;
        }

        return result;
    }
}