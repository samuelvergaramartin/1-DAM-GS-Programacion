/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo25 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int num, resto = 0;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        while(num > 0) {
            resto = num % 10 + resto*10;
            num = num / 10;
        }
        System.out.println(resto);
        sc.close();
        System.exit(0);
    }
}
