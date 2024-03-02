/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P9 {
   public static void main(String[] args) {
     String input = "", resultado = "";
     Scanner sc = new Scanner(System.in);

     do {
        System.out.print("Escriba una palabra: ");
        input = sc.nextLine();

        if(!input.toLowerCase().equals("fin")) resultado+= " " + input;
     }
     while(!input.toLowerCase().equals("fin"));

     sc.close();

     System.out.println(resultado);
   } 
}
