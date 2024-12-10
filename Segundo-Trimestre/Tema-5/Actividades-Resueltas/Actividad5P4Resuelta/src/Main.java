import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tabla[] = new int[5], maximo;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < tabla.length; i++) {
            System.out.print("Introduce un número: ");
            tabla[i] = sc.nextInt();
        }

        maximo = maximo(tabla);

        System.out.println("El máximo es: " + maximo);
    }

    private static int maximo(int[] t) {
        int resultado;

        Arrays.sort(t);
        resultado = t[t.length -1 ];

        return resultado;
    }
}