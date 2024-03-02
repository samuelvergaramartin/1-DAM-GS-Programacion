/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo18 {
    public static void main(String[] args) {
        int a,b,menor,mayor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        a = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        b = sc.nextInt();

        sc.close();

        if(a == b) {
            System.out.println("ERROR: Los numeros introducidos deben ser distintos.");
        }
        else {
           if(a < b) {
                menor = a;
                mayor = b;
           }
           else {
                menor = b;
                mayor = a;
           }
           
        }
    }
}
