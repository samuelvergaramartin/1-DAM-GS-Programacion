package examenglobalsegundotrimestre;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class ExamenGlobalSegundoTrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercito ejercito1 = new Ejercito();
        Ejercito ejercito2 = new Ejercito();
        String menu = """
                      Menu Principal:
                      1 - Mostrar ejercitos.
                      2 - Atacar ejercito 1.
                      3 - Atacar ejercito 2.
                      0 - Salir
                      """;
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        boolean ejercitoDerrotado = false;
        
        do {
            System.out.println(menu);
            System.out.print("Introduce una opcion: ");
            opt = sc.nextInt();
            
            switch(opt) {
                case 0: System.out.println("Finalizando programa...");
                break;
                case 1: System.out.println(ejercito1.toString() + "\n" + ejercito2.toString());
                break;
                case 2: {
                    ejercito1.attack();
                    ejercitoDerrotado = ejercito1.ejercitoDerrotado();
                }
                break;
                case 3: {
                    ejercito2.attack();
                    ejercitoDerrotado = ejercito2.ejercitoDerrotado();
                }
                break;
            }
        } while(opt != 0 && !ejercitoDerrotado);
        if(ejercitoDerrotado) System.out.println("El ejercito fue derrotado.");
    }
    
}
