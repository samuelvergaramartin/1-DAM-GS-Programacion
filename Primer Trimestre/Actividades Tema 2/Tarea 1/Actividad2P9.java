/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad2P9 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre el 0 y el 99.999: ");
        num = sc.nextInt();

        if(num < 10) {
            System.out.println("El numero introducido tiene una cifra");
            sc.close();
            return;
        }
        else if(num < 100) {
            System.out.println("El numero introducido tiene 2 cifras");
            sc.close();
            return;
        }
        else if(num < 1000) {
            System.out.println("El numero introducido tiene 3 cifras");
            sc.close();
            return;
        }
        else if(num < 10000) {
            System.out.println("El numero introducido tiene 4 cifras");
            sc.close();
            return;
        }
        else if(num < 100000) {
            System.out.println("El numero introducido tiene 5 cifras");
            sc.close();
            return;
        }
        sc.close();
        System.exit(1);
    }
}
