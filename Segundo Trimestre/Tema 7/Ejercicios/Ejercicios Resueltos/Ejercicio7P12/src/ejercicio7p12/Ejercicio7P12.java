package ejercicio7p12;
import static ejercicio7p12.Lista.concatena;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array1[] = { 1, 2 ,3 ,4, 5, 6, 7, 8, 9, 10};
        int array2[] = { 11, 12, 13, 14, 15 , 16, 17, 18, 19, 20};
        int resultado[];
        resultado = concatena(array1, array2);
        String readResultArray = java.util.Arrays.toString(resultado);
        System.out.println(CYAN + readResultArray);
    }
}
