package actividad6p9;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, frase = "";
        do {
            System.out.print("Escriba una palabra: ");
            input = sc.nextLine();
            if(!input.equals("fin")) frase+= " " + input;
        }
        while (!input.equals("fin"));
        
        System.out.println(frase);
    }
    
}
