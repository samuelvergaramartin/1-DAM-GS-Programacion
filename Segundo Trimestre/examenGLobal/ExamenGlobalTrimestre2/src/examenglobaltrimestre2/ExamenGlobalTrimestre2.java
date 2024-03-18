package examenglobaltrimestre2;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class ExamenGlobalTrimestre2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercito ejercito = new Ejercito();
        Scanner sc = new Scanner(System.in);
        String ejercitoInfo;
        int opt;
        String menu = "MENU DE OPCIONES\n1. Mostrar ejercitos.\n2. Atacar ejercito 1.\n3. Atacar ejercito 2.\n4. Salir.";
        boolean ejercitoDerrotado = false;
        
        do {
            System.out.println(menu);
            System.out.print("Introduce una opcion: ");
            opt = sc.nextInt();
            switch(opt) {
                case 1: System.out.println(ejercito.toString());
            }
        }
        while(!ejercitoDerrotado && opt != 4);
    }
    
}
