import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contCaracteres = 0, contLineas = 0, contPalabras = 0;
        String contenidoCarta = "", linea;
        Scanner sc;

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P14Aplicacion/carta.txt"))) {
              linea = in.readLine();
              while(linea != null) {
                  contenidoCarta += linea + "\n";
                  contLineas++;

                  sc = new Scanner(linea);
                  while(sc.hasNext()) {
                      contPalabras++;
                      sc.next();
                  }
                  contCaracteres += linea.length() + 1;

                  linea = in.readLine();
              }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Número de caracteres: " + contCaracteres);
        System.out.println("Número de líneas: " + contLineas);
        System.out.println("Número de palabras: " + contPalabras);

        System.out.println("Contenido de la carta:\n" + contenidoCarta + "\n");
    }
}