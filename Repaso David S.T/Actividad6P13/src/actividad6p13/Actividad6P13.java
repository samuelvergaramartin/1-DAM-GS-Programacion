package actividad6p13;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int longitud = Character.hashCode('z') - Character.hashCode('a');
        char abecedario[] = new char[longitud + 1];
        int n = Character.hashCode('a');
        for(int i = 0; i <= longitud; i++) {
            abecedario[i] = (char) (n);
            n++;
        }
        System.out.println(java.util.Arrays.toString(abecedario));
    }
    
}
