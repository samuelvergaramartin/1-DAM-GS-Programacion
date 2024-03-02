/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P6 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        for(int x = 1; x <= num; x++) {
            System.out.println(x);
        }
        sc.close();
        System.exit(0);
    }
}
