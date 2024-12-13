import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[100], numero1, numero2;
        Scanner sc = new Scanner(System.in);

        rellenarArray(numeros);

        mostrarArray(numeros);

        System.out.print("Introduzca el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        numero2 = sc.nextInt();

        cambiarPor(numeros, numero1, numero2);

        mostrarArray(numeros);
    }

    private static void rellenarArray(int numeros[]) {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 20));
        }
    }

    private static void mostrarArray(int numeros[]) {
        for(int e: numeros) {
            System.out.print(e + " ");
        }

        System.out.println();
    }

    private static void cambiarPor(int numeros[], int numero1, int numero2) {
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numero1) numeros[i] = numero2;
        }
    }
}