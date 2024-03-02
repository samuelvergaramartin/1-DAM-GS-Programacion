/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P3 {
   public static void main(String[] args) {
     int select = 1;
     Scanner sc = new Scanner(System.in);
     String password = "null", input = "null";
     if(select == 1) version1(sc, password, input);
     else version2(sc, password, input);
   }
   static void version1(Scanner sc, String password, String input) {
     System.out.print("Jugador 1. Introduce una password: ");
     password = sc.nextLine();

     do {
       System.out.print("Jugador 2. Introduzca la password: ");
       input = sc.nextLine();

       if(input.length() < password.length()) System.out.println("La password introducida es menor que la password correcta.");
       if(input.length() > password.length()) System.out.println("La password introducida es mayor que la password correcta");
       if(input.length() == password.length()) System.out.println("La password introducida es igual que la password correcta");
     } 
     while(!password.equals(input));
     sc.close();
     System.out.println("Has acertado la password!");
   }
   static void version2(Scanner sc, String password, String input) {
     System.out.print("Jugador 1. Introduce una password: ");
     password = sc.nextLine();
   }
}
