/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadRefuerzo3 {
    public static void main(String[] args) {
        int inputValue;
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        int resultado[] = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            inputValue = sc.nextInt();

            numeros[i] = inputValue;
        }

        sc.close();

        resultado = revertir(numeros);

        System.out.println(Arrays.toString(resultado));
    }
    static int[] revertir(int[] t) {
        

        return t;
    }
}
