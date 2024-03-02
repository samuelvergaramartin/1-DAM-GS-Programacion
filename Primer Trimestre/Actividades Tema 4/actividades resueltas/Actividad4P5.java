/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P5 {
    public static void main(String[] args) {
       char c;
       boolean resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un caracter: ");
        c = sc.nextLine().charAt(0);
        
        sc.close();
        
        resultado = vocal(c);
        
        System.out.println(resultado);
        
        System.exit(0);
    }
    static boolean vocal(char caracter) {
        if(caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u' &&
        caracter != 'A' && caracter != 'E' && caracter != 'i' && caracter != 'O' && caracter != 'U') {
            return false;
        }
        else {
            return true;
        }
    }

}