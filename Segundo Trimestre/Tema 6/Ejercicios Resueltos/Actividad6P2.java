/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String c1,c2;

      System.out.print("Introduce un string: ");
      c1 = sc.nextLine();

      System.out.print("Introduce otro string: ");
      c2 = sc.nextLine();

      sc.close();

      if(c1.length() < c2.length()) System.out.println(c1 + " es mas corta que " + c2);
      else if(c1.length() == c2.length()) System.out.println(c1 + " es igual que " + c2);
      else System.out.println(c2 + " es mas corta que " + c1);
   }
}
