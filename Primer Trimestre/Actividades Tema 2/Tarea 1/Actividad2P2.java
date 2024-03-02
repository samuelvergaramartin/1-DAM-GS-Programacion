/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
 public class Actividad2P2 {
    public static void main(String[] args) {
       int num1,num2;
       Scanner sc = new Scanner(System.in);

       System.out.print("Introduce un numero: ");
       num1 = sc.nextInt();

       System.out.print("Introduce un numero: ");
       num2 = sc.nextInt();

       if(num1 == num2) {
        System.out.println("iguales");
       }
       else {
        System.out.println("Distintos");
       }
       sc.close();
    }
 }