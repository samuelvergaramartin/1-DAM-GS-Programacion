import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        num1 = pedirNumero(sc);
        num2 = pedirNumero(sc);

        mostrarEnteros(num1, num2);
    }

    private static int pedirNumero(Scanner sc) {
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }
    private static void mostrarEnteros(int num1, int num2) {
        int mayor = Math.max(num1, num2), menor = Math.min(num1, num2);

        for(int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}