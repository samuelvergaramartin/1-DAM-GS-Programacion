/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
 public class Actividad2P1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if(num%2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Inpar");
        }

        sc.close();
    }
 }