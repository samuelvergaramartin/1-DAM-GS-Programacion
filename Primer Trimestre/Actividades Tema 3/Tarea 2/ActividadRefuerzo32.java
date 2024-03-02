
/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;

public class ActividadRefuerzo32 {
    public static void main(String[] args) {
        long num, numIvertido = 0, numContruidoPorParesdelDerecho = 0, totalPares;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero entero positivo: ");
        num = sc.nextInt();

        sc.close();

        numContruidoPorParesdelDerecho = resolver(num, numIvertido, numContruidoPorParesdelDerecho);
        totalPares = sumarPares(numContruidoPorParesdelDerecho);

        System.out.println("\nSuma de los digitos pares: " + totalPares);

        System.exit(0);
    }

    static long resolver(long num, long numIvertido, long numContruidoPorParesdelDerecho) {
        int posicion = 0;
        long resultado = 0;
        while (num > 0) {
            resultado = num % 10 + resultado * 10;
            num = num / 10;
            posicion++;
        }
        numContruidoPorParesdelDerecho = buildnumPar(resultado, posicion);
        return numContruidoPorParesdelDerecho;
    }

    static long buildnumPar(long num, int posicion) {
        System.out.print("Digitos pares: ");
        long resultado = 0;
        for (int i = 1; i <= posicion; i++) {
            if ((num % 10) % 2 == 0) {
                System.out.print(num % 10 + " ");
                resultado = resultado * 10 + num % 10;
            }
            num /= 10;
        }
        return resultado;
    }

    static long sumarPares(long num) {
        long resultado = 0;
        while (num > 0) {
            resultado += num % 10;
            num = num / 10;
        }
        return resultado;
    }
}
