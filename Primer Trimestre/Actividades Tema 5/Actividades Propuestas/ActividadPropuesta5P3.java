/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadPropuesta5P3 {
    public static void main(String[] args) {
        int n,num,totalNCeros;
        int numeros[];
        double mPos,mNeg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de n: ");
        n = sc.nextInt();

        numeros = new int[n];

        for(int i = 0;i<numeros.length;i++) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            numeros[i] = num;
        }

        sc.close();

        
    }
    static double mediaPositivos(int[] numeros) {
        return 0;
    }
    static double mediaNegativos(int[] numeros) {
        return 0;
    }
    static int totalCeros(int[] numeros) {
        return 0;
    }
}