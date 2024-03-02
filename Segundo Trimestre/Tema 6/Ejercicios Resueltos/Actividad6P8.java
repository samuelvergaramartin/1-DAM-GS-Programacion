/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P8 {
    public static void main(String[] args) {
      String input;
      Scanner sc = new Scanner(System.in);
      final String prefijo = "Javalin, javalon";
      final String sufijo = "Javalen, len, len";
      boolean idioma = false;

      System.out.print("Escriba una frase: ");
      input = sc.nextLine();

      if(input.startsWith(prefijo)) {
        idioma = true;
      }
    }
}
