import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        resultado = fibonacci(num);

        System.out.println("El resultado es: " + resultado);
    }

    private static int fibonacci(int num) {
        int resultado;

        if(num == 0 || num == 1) {
            resultado = 1;
        }
        else {
            resultado = fibonacci(num - 1) + fibonacci(num - 2);
        }

        return resultado;
    }
}