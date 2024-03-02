/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P16 {
    public static void main(String[] args) {
        int numero, numeroabs;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        
        numeroabs = (numero >= 0) ? numero : Math.abs(numero); 
        System.out.println("El numero en valor absoluto es " + numeroabs);
        
        sc.close();
        System.exit(0);
    }
}
