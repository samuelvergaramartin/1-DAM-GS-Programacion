package actividad6p11;
import java.util.Scanner;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, output;
        
        System.out.print("Introduce una palabra: ");
        input = sc.nextLine();
        input = input.toLowerCase();
        
        output = codificar(input);
        
        System.out.println(output);
    }
    static String codificar(String input) {
        char conjunto1[] = {'e','i','k','m','p','q','r','s','t','u','v'},
        conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'}, in[] = input.toCharArray();
        String result = "";
        
        for(int i = 0; i < in.length; i++) result+= codifica(conjunto1,conjunto2,in[i]);
        
        return result;
    }
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        boolean codificado = false;
        int contador = 0;
        
        do if(conjunto1[contador] == c) codificado = true;
        else contador++;
        while(!codificado && contador < conjunto1.length);
        
        if(codificado == true) return conjunto2[contador];
        else return c;
    }
}
