import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        desordenar(numeros);

        System.out.println(Arrays.toString(numeros));
    }

    private static void desordenar(int tabla[]) {
        int posAleatoria, temp, temp2, resultado[] = new int[tabla.length];
        boolean aux[] = new boolean[resultado.length];

        for(int i = 0; i < tabla.length; i++) {
            
        }
        /*for(int i = 0; i < tabla.length; i++) {

            for(int x = i; x < tabla.length; x++) {
                do {
                    posAleatoria1 = (int) ((Math.random()) * tabla.length - 1);
                    temp2 = tabla[posAleatoria1];
                }
                while (posAleatoria1 == tabla[x]);

                temp = tabla[posAleatoria1];
                tabla[i] = tabla[temp2];
                tabla[x] = temp;
            }
        }*/
    }
}