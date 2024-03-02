/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo10 {
   public static void main(String[] args) {
        int num, positivos = 0, suma = 0;
        double media;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; true; i++) {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();

            if(num <= 0) {
                media = suma/positivos;

                System.out.println("La media es: " + media);
                sc.close();
                System.exit(0);
                break;
            }
            else {
                suma+=num;
                positivos++;
            }
        }
        sc.close();
        System.exit(0);
   } 
}
