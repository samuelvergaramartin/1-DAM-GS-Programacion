/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class Actividad5P5 {
    public static void main(String[] args) {
        int resultado[],longitud;
        longitud = 5;
        resultado = rellenaPares(longitud, 99999);

        System.out.println(Arrays.toString(resultado));
    }
    static int[] rellenaPares(int longitud, int fin) {
        int resultado[],temp;
        resultado = new int[longitud];

        for(int i = 0; i<resultado.length; i++) {
            do {
                temp = (int) (Math.random() * fin + 2);
                
            }
            while(temp % 2 != 0);
            resultado[i] = temp;
        }

        return resultado;
    }
}
