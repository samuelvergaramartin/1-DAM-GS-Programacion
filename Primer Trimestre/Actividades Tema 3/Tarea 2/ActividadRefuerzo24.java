/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int y = 1; y <=  n - i; y++) {
                System.out.print(" ");
            }
            for(int izquierda = 1; izquierda <= i; izquierda ++) {
                System.out.print(izquierda);
            }
            for(int derecha = i -1; derecha >= 1; derecha--) {
                System.out.print(derecha);
            }
        }
            System.out.println("");
        }
    }
