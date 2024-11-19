package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //La variable numTemp es como un "auxiliar" para almacenar numeros de forma temporal.
        int num,numTemp, resultado = 0, digitos = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = sc.nextInt();
        }
        while (num <= 0);

        numTemp = num;

        while (numTemp/10 > 0) {
            digitos++;
            numTemp/=10;
        }

        numTemp = num;

        for(int i = 1; i <= digitos; i++) {
            resultado+= numTemp%10;
            numTemp/=10;
        }

        while (resultado >= 10) {
            numTemp = resultado;
            resultado = 0;

            for(int i = 1; i <= digitos; i++) {
                resultado+= numTemp%10;
                numTemp/=10;
            }
        }

        System.out.println("El crápulo de " + num + " es " + resultado);
    }
    
}
