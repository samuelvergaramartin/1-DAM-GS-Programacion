import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3, max;
        Scanner sc = new Scanner(System.in);

        num1 = pedirNumero(sc);
        num2 = pedirNumero(sc);
        num3 = pedirNumero(sc);

        max = maximo(num1, num2, num3);

        System.out.println("El máximo es: " + max);
    }
    private static int maximo(int num1, int num2, int num3) {
        int resultado;
        resultado = Math.max(num1, num2);
        resultado = Math.max(resultado, num3);

        return resultado;
    }
    private static int pedirNumero(Scanner sc) {
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }
}