import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosActividad10P14Aplicacion/";
        Scanner sc = null;
        int nCaracteres = contarCaracteres(directory),
        lineas = contarLineas(directory),
        palabras = contarPalabras(directory, sc);

        System.out.println("Numero de caracteres: " + nCaracteres);
        System.out.println("Numero de lineas: " + lineas);
        System.out.println("Numero de palabras: " + palabras);


    }
    static int contarCaracteres(String directory) {
        int nCaracteres = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(directory + "carta.txt"))){
            int c = in.read();
            while(c != -1) {
                nCaracteres++;
                c = in.read();
            };
        }
        catch (IOException exception){
            System.out.println(exception);
        }

        return nCaracteres;
    }

    static int contarLineas(String directory) {
        int lineas = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(directory + "carta.txt"))){
            String line = in.readLine();
            while(line != null) {
                lineas++;
                line = in.readLine();
            }
        }
        catch(IOException exception) {
            System.out.println(exception);
        }

        return lineas;
    }
    static int contarPalabras(String directory, Scanner sc) {
        int palabras = 0;
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(directory + "carta.txt"))){
            line = in.readLine();
            while(line != null) {
                sc = new Scanner(line);
                while(sc.hasNext()) {
                    palabras++;
                    sc.next();
                }
                line = in.readLine();
            }
        }
        catch(IOException exception) {
            System.out.println(exception);
        }

        return palabras;
    }
}