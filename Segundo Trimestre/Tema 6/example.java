/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
       String cad, cad2;
       Scanner sc = new Scanner(System.in);

       System.out.print("Introduce una cadena: ");
       cad = sc.nextLine();

       System.out.print("Introduce una cadena: ");
       cad2 = sc.nextLine();
  
       System.out.println(cad.equals(cad2));
    }
}
