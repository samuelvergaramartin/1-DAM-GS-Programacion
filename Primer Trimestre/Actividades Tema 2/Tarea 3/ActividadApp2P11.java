/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P11 {
    public static void main(String[] args) {
        int num, a, b, c, d;
        boolean capicua = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe un numero entre el 0 y el 9999: ");
        num = sc.nextInt();
        
        a = num % 10;
        num /= 10;
        b = num % 10;
        num /= 10;
        c = num % 10;
        num /= 10;
        d = num;
        
        if (a == d && b == c) {
            capicua = true;
        } else if (d == 0 && a == c) {
            capicua = true;
        } else if (d == 0 && c == 0 && a == b) {
            capicua = true;
        } else if (d == 0 && c == 0 && b == 0) {
            capicua = true;
        }
        
        if (capicua) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        } 
        
        sc.close();
        System.exit(0);
    }
}