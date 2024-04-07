package actividad6p6;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, output = "";
        char in[], vocales[] = {'a','e','i','o','u','A','E','I','O','U','Á','É','Í','Ó','Ú','á','é','í','ó','ú'};
        
        System.out.print("Introduzca su nombre completo: ");
        input = sc.nextLine();
        in = input.toCharArray();
        
        for(int i = 0; i < in.length; i++) if(!esVocal(in[i], vocales)) output += in[i];
        
        System.out.println(output);
    }
    static boolean esVocal(char c, char vocales[]) {
        boolean result = false;
        for(int i = 0; i < vocales.length; i++) if(vocales[i] == c) result = true;
        return result;
    }
    
}
