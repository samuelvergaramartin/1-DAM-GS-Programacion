/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P11Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char codificado[];
        String texto, resultado = "";

        System.out.print("Escribe el texto codificado: ");
        texto = sc.nextLine();
        sc.close();
        texto = texto.toLowerCase();

        codificado = texto.toCharArray();

        for(int i = 0; i < codificado.length; i++) {
            for(int x = 0; x < conjunto2.length; x++) {
              if(codificado[i] == conjunto2[x]) codificado[i] = conjunto1[x];
            }
          }
          for(int i = 0; i < codificado.length; i++) {
            resultado+=codificado[i];
          }
          System.out.println(resultado);
    }
}
