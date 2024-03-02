/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P6 {
  public static void main(String[] args) {
     String input, result;
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce tu nombre completo: ");
     input = sc.nextLine();

     result = vocalKiller(input);

     System.out.println(result);
  }
  static String vocalKiller(String cadena) {
    String result = "";
    int posiciones[] = new int[cadena.length()];
    int carr = 0;

    return cadena;
  }
  static int[] posicionesVocales(String cadena, int[] posiciones, int carr) {
    int c = 0;
    while((c < cadena.length()) && (cadena.indexOf('a', c))) {
      posiciones[carr] = cadena.indexOf('a', c);
      c = cadena.indexOf('a', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('A', c)) {
      posiciones[carr] = cadena.indexOf('A', c);
      c = cadena.indexOf('A', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('e', c)) {
      posiciones[carr] = cadena.indexOf('e', c);
      c = cadena.indexOf('e', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('E', c)) {
      posiciones[carr] = cadena.indexOf('E', c);
      c = cadena.indexOf('E', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('i', c)) {
      posiciones[carr] = cadena.indexOf('i', c);
      c = cadena.indexOf('i', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('I', c)) {
      posiciones[carr] = cadena.indexOf('I', c);
      c = cadena.indexOf('I', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('o', c)) {
      posiciones[carr] = cadena.indexOf('o', c);
      c = cadena.indexOf('o', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('O', c)) {
      posiciones[carr] = cadena.indexOf('O', c);
      c = cadena.indexOf('O', c) + 1;
      carr++;
    }
    c = 0;
    while(c < cadena.length() && cadena.indexOf('u', c)) {
      posiciones[carr] = cadena.indexOf('u', c);
      c = cadena.indexOf('u', c) + 1;
      carr++;
    }
     c = 0;
    while(c < cadena.length() && cadena.indexOf('U', c)) {
      posiciones[carr] = cadena.indexOf('U', c);
      c = cadena.indexOf('U', c) + 1;
      carr++;
    }
    c = 0;
  }
}
