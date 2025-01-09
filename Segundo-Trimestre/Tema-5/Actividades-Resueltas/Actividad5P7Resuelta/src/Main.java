import static java.util.Arrays.copyOf;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[10], resultado[];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        resultado = sinRepetidos(numeros);

        System.out.println(java.util.Arrays.toString(resultado));
    }

    private static int[] sinRepetidos(int t[]) {
        int resultado[] = new int[1], index;
        boolean encontrado, primeraPosicionRellenada = false;

        for(int i = 0; i < t.length; i++) {
            encontrado = false;
            index = 0;

            if(resultado.length == 1 && !primeraPosicionRellenada) {
                resultado[index] = t[i];
                encontrado = true;
                primeraPosicionRellenada = true;
            }
            else {
                while (index < resultado.length && !encontrado) {
                    if(resultado[index] == t[i]) encontrado = true;

                    index++;
                }
            }

            if(!encontrado) {
                resultado = copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = t[i];
            }
        }

        return resultado;
    }
}