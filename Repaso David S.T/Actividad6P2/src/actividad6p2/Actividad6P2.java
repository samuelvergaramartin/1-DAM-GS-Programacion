package actividad6p2;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c1,c2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la primera cadena: ");
        c1 = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        c2 = sc.nextLine();
        
        if(c1.length() < c2.length()) System.out.println(c1);
        else System.out.println(c2);
    }
    
}
