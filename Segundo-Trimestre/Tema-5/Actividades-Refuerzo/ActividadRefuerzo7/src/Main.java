import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[100], numero1, numero2;
        String numeritos[] = new String[100];
        Scanner sc = new Scanner(System.in);

        rellenarArray(numeros, numeritos);

        mostrarArray(numeros);

        System.out.print("Introduzca el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        numero2 = sc.nextInt();

        cambiarPor(numeritos, numero1, numero2);

        mostrarArray(numeritos);
    }

    private static void rellenarArray(int numeros[], String numeritos[]) {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 20));
            numeritos[i] = numeros[i] + "";
        }
    }

    private static void mostrarArray(int numeros[]) {
        for(int e: numeros) {
            System.out.print(e + " ");
        }

        System.out.println();
    }

    private static void mostrarArray(String numeritos[]) {
        for(String e: numeritos) {
            System.out.print(e + " ");
        }

        System.out.println();
    }

    private static void cambiarPor(String numeritos[], int numero1, int numero2) {
        for(int i = 0; i < numeritos.length; i++) {
            if(numeritos[i].equals(numero1 + "")) numeritos[i] = "'" + numero2 + "'";
        }
    }
}