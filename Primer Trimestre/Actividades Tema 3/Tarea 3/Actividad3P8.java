/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P8 {
    public static void main(String[] agrs) {
        int num,suma = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            System.out.print("Escribe un numero entero: ");
            num = sc.nextInt();

            suma+=num;

            if(i == 10) {
                System.out.println((double) suma / 10);
            }
        }
        sc.close();
        System.exit(0);
    }
}
