import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result1, result2;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un número mayor que 0: ");
            n = sc.nextInt();
        }
        while (n <= 0);

        result1 = iterativa(n);
        result2 = recursiva(3, n);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static double iterativa(int n) {
        double resultado = 0;
        for(int i = 1; i <= n; i++) {
            if(resultado == 0) {
                resultado = n*n;
            }
            else resultado*=n;
        }

        return resultado;
    }

    private static double recursiva(double a, int n) {
        double res;

        if(n == 0) {
            res = 1;
        }
        else {
            res = a * recursiva(a, n-1);
        }

        return res;
    }
}