/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo13 {
    public static void main(String[] args) {
        int num, positivos = 0, negativos = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 10; i <= 10; i++) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            if(num <= 0) {
                negativos++;
            }
            else {
                positivos++;
            }
        }
        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos);
        sc.close();
        System.exit(0);
    }
}
