/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P10 {
  public static void main(String[] args) {
    String input = "", fraseSinEspacios, fraseInvertida;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la frase: ");
    input = sc.nextLine();

    sc.close();;

    input = input.toLowerCase();

    fraseSinEspacios = eliminarEspacios(input);
    fraseInvertida = invertirCadena(fraseSinEspacios);

    if(fraseSinEspacios.equals(fraseInvertida)) {
      System.out.println("La frase es palíndroma");
    }
    else {
      System.out.println("La frase no es palíndroma");
    }
  } 
  static String eliminarEspacios(String cadena) {
    String x = "";
    for(int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if(!Character.isWhitespace(c)) x+= c;
    }
    return x;
  }
  static String invertirCadena(String cadena) {
    String resultado = "";
    for(int i = 0; i < cadena.length(); i++) {
      resultado+= cadena.charAt(i);
    }
    return resultado;
  }
}
