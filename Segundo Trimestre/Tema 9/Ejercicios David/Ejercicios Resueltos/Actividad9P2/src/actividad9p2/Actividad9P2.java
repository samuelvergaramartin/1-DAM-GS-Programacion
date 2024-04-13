package actividad9p2;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad9P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista miLista = new Lista();
        int n = 0;
        
        do {
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
            if(n >= 0) miLista.Encolar(n);
            else {
                System.out.println(miLista.toString());
                while (miLista.getTotalElementos() > 0) {
                    miLista.Desencolar();
                    System.out.println(miLista.toString());
                }
                System.out.println(miLista.toString());
            }
        }
        while(n >= 0);
    }
    
}
