/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P15 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();

        if(num <= 0) {
            System.out.println("ERROR: El numero introducido debe ser mayor que 0.");
            sc.close();
            System.exit(1);
        }

        for(int i=num; i >= 1; i--) {
            for(int x = 1; x <=i; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
        System.exit(0);
    }
}
