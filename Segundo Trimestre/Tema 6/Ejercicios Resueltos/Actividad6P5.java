/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P5 {
  public static void main(String[] args) {
    String cadena, cadenaInvertida;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    cadena = sc.nextLine();

    sc.close();

    cadenaInvertida = invertirCadena(cadena);

    System.out.println(cadenaInvertida);
  }
  static String invertirCadena(String cadena) {
    String resultado = "";
    char c;
    for(int i = cadena.length() - 1; i >= 0; i--) {
      c = cadena.charAt(i);
      resultado+=c;
    }

    return resultado;
  }
}
