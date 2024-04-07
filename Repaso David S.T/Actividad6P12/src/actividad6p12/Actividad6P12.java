package actividad6p12;
import java.util.Scanner;
import static java.util.Arrays.sort;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1, input2;
        char p1[],p2[];
        boolean anagramas;
        
        System.out.print("Introduce una palabra: ");
        input1 = sc.nextLine();
        
        System.out.print("Introduce otra palabra: ");
        input2 = sc.nextLine();
        
        if(input1.length() != input2.length()) System.out.println("No son anagramas");
        else {
            p1 = input1.toCharArray();
            p2 = input2.toCharArray();
            
            sort(p1);
            sort(p2);
            
            if(java.util.Arrays.equals(p1, p2)) System.out.println("Son anagramas");
            else System.out.println("No son anagramas.");
        }
    }
}
