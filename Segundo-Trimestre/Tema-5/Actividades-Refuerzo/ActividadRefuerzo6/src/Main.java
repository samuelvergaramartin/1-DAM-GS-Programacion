import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[15];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        rotar(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    private static void rotar(int numeros[]) {
        int numero = numeros[numeros.length - 1];

        for(int i = numeros.length - 2; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[0] = numero;
    }
}