import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, max;
        Scanner sc = new Scanner(System.in);

        num1 = pedirNumero(sc);
        num2 = pedirNumero(sc);

        max = maximo(num1, num2);

        System.out.println("El máximo es: " + max);
    }

    private static int pedirNumero(Scanner sc) {
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }

    private static int maximo(int num1, int num2) {
        int result = num1 > num2 ? num1 : num2;
        return result;
    }
}