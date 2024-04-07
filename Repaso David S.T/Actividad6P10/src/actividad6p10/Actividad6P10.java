package actividad6p10;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean palindroma;
        
        System.out.print("Introduzca una frase: ");
        input = sc.nextLine();
        input = eliminarEspaciosEnBlanco(input);
        
        palindroma = esPalindroma(input);
        
        if(palindroma) System.out.println("Es palindroma");
        else System.out.println("No es palindroma");
    }
    static String eliminarEspaciosEnBlanco(String input) {
        String resolved = "";
        char unresolved[] = input.toCharArray();
        
        for(int i = 0; i < unresolved.length; i++) if(!Character.isWhitespace(unresolved[i])) resolved+= unresolved[i];
        
        return resolved;
    }
    static boolean esPalindroma(String input) {
        char normal[],reverso[];
        boolean result = true;
        normal = input.toCharArray();
        reverso = new char[normal.length];
        int contador = 0;
        
        for(int i = normal.length - 1; i >= 0; i--) {
            reverso[contador] = normal[i];
            contador++;
        }
        for(int i = 0; i < normal.length; i++) if(normal[i] != reverso[i]) result = false;
        
        return result;
    }
}
