package actividad6p7;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6p7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int contador = 0, index = 0;
        
        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        
        System.out.print("Introduzca una palabra: ");
        palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        
        do {
            index = frase.indexOf(palabra, index);
            if(index != -1) {
                index += palabra.length();
                contador++;
            }
        }
        while(index != -1);
        
        System.out.println("Numero de veces que se repite la palabra " + palabra + " en la frase: " + contador);
    }
    
}
