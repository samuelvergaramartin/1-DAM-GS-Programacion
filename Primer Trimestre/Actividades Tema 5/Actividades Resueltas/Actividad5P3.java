/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad5P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numeros[];

        System.out.print("Introduce cuantos numeros deseas introducir: ");
        num = sc.nextInt();

        numeros = new int[num];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        sc.close();

        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
