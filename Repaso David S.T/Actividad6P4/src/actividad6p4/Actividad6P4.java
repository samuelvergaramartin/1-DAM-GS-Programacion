package actividad6p4;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        char f[];
        int espacios = 0;
        
        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();
        f = frase.toCharArray();
        
        for(int i = 0; i < f.length; i++) {
            if(Character.isSpaceChar(f[i])) espacios++;
        }
        
        System.out.println("La frase introducida tiene un total de " + espacios  + " espacios");
    }
    
}
