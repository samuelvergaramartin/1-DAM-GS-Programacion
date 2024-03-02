/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P4 {
  public static void main(String[] args) {
     String input;
     char c;
     int spaces = 0;
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce una frase: ");
     input = sc.nextLine();

     sc.close();

     for(int i = 0; i < input.length(); i++) {
       c = input.charAt(i);
       if(Character.isSpaceChar(c)) spaces++;
     }

     System.out.println("La frase introducida tiene un total de " + spaces + " espacios.");
  }
}
