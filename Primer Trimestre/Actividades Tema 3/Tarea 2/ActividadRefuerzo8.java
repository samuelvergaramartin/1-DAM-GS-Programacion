/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo8 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();

        for(int x = 0; x <= 10; x++) {
            System.out.println(num + " X " + x + " = " + num*x);
        }
        sc.close();
        System.exit(0);
    }
}
