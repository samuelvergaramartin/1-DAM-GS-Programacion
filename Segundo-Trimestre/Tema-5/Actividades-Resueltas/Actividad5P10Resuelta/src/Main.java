import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[0], valorMaximo;
        Scanner sc = new Scanner(System.in);

        numeros = introducirValores(numeros, sc);

        System.out.print("Introduzca el valor maximo: ");
        valorMaximo = sc.nextInt();

        numeros = eliminarMayores(numeros, valorMaximo);

        System.out.println(java.util.Arrays.toString(numeros));
    }

    private static int[] introducirValores(int numeros[], Scanner sc) {
        int valor;

        System.out.print("Introduzca un numero: ");
        valor = sc.nextInt();

        while (valor != -1) {
            numeros = copyOf(numeros, numeros.length + 1);
            numeros[numeros.length - 1] = valor;

            System.out.print("Introduzca un numero: ");
            valor = sc.nextInt();
        }

        return numeros;
    }

    private static int[] eliminarMayores(int t[], int valor) {
        int elementosBorrados = 0, aux[] = new int[0];

        for(int i = 0; i < t.length; i++) {
            while (t[i] > valor) {
                System.out.println("Indice: " + i);
                System.out.println(java.util.Arrays.toString(t));
                t[i] = t[t.length - 1];
                t[t.length - 1] = 0;
                if(t[i] == 0 && i != t.length - 1) {
                    t[i] = t[i+1];
                    for(int x = t[i+1]; x < t.length - 1; x++) {
                        t[x] = t[x+1];
                    }
                }
                System.out.println(java.util.Arrays.toString(t));
                System.out.println("----------");
                elementosBorrados++;
            }
        }
        System.out.println(" ");
        return copyOf(t, t.length - elementosBorrados);
    }
}