import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        num2 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        num3 = sc.nextInt();

        resultado = maximo(num1, num2, num3);

        System.out.println("El máximo es: " + resultado);
    }

    private static int maximo(int num1, int num2, int num3) {
        int resultado;

        resultado = Math.max(num1, num2);
        resultado = Math.max(resultado, num3);

        return resultado;
    }
}