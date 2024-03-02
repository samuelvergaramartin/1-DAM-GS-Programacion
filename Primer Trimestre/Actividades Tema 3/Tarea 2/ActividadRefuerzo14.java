/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo14 {
    public static void main(String[] args) {
        int base,exponente;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base = sc.nextInt();

        System.out.print("Introduzca el exponente: ");
        exponente = sc.nextInt();

        if(exponente <= 0) {
            System.out.println("ERROR: El exponente debe ser positivo");
            sc.close();
            System.exit(1);
        }

        System.out.println("El resultado es: " + Math.pow(base, exponente));
        sc.close();
        System.exit(0);
    }
}