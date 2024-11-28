import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        resultado = mcd(num1, num2);

        System.out.println("El MDC de " + num1 + " y " + num2 + " es " + resultado);
    }

    private static int mcd(int num1, int num2) {
        int resultado, min, max;

        if(num1 == 0) {
            resultado = num2;
        }
        else if(num2 == 0) {
            resultado = num1;
        }
        else {
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);

            resultado = mcd(min, max-min);
        }

        return resultado;
    }
}