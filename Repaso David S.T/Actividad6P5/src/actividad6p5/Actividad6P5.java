package actividad6p5;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, invertido = "";
        char inp[], inv[];
        
        System.out.print("Introduce una frase: ");
        input = sc.nextLine();
        inp = input.toCharArray();
        inv = new char[inp.length];
        int c = 0;
        for(int i = inp.length - 1; i >= 0; i--) {
            inv[c] = inp[i];
            c++;
        }
        for(int i = 0; i < inv.length; i++) invertido += inv[i];
        
        System.out.println(invertido);
    }
    
}
