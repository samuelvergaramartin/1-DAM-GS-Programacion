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
        Scanner sc;
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

        System.out.println(nCaracteres);
    }
}