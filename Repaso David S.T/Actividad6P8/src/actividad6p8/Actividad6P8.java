package actividad6p8;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String header = "Javalín, javalón                 ",tail = "                 javalén, len, len";
        String input, message;
        char h[],t[],i[],m[];
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un mensaje: ");
        input = sc.nextLine();
        
        if(input.startsWith(header) || input.endsWith(tail)) System.out.println("Está en escrito en el idioma de Javalandia");
        else System.out.println("No está escrito en el idioma de Javalandia");
        
        h = header.toCharArray();
        t = tail.toCharArray();
        i = input.toCharArray();
        m = new char[i.length - t.length - h.length];
        for(int x = h.length; x < i.length - t.length; x++) {
            m[contador] = i[x];
        }
        for(int x = 0; x < m.length; x++) {
            
        }
    }
    
}
