/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo9 {
    public static void main(String[] args) {
        long num;
        int cifras = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextLong();
        while(num % 10 == 0) {
            num = num / 10;
	        cifras++;
        }
        System.out.println("El numero tiene " + cifras + " cifras");
        sc.close();
        System.exit(0);
    }
}
