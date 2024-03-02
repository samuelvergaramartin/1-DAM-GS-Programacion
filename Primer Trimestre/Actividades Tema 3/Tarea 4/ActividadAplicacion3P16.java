/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P16 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        /*System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" * * *");
        System.out.println("* * * *");*/

        //Bucle  externo: genero las filas
        for(int i = 1; i <= num; i++) {
            //Bucle interno: escribo los huecos
            for(int x = num; x > i; x--) {
                System.out.print(" ");
            }
            //Bucle interno: escribo los asteriscos
            for(int x = 1; x <= i; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
        System.exit(0);
    }
    
}
