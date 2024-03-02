/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
 public class Actividad2P5 {
    public static void main(String[] args) {
       int num1,num2;
       Scanner sc = new Scanner(System.in);

       System.out.print("Introduce un numero: ");
       num1 = sc.nextInt();

       System.out.print("Introduce un numero: ");
       num2 = sc.nextInt();

       if(num1 > num2) {
        System.out.println(num1 + "\n" + num2);
       }
       else {
        System.out.println(num2 + "\n" + num1);
       }


       sc.close();

       System.exit(0);
    }
 }