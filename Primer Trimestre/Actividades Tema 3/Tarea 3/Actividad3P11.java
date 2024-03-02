/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P11 {
    public static void main(String[] args) {
        double factorial;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        factorial = 1;
        for (int i = num; i > 0; i--) {
        factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + "es: " + "factorial");
        sc.close();
        System.exit(0);
    }
}
