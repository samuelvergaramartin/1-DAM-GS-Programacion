import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader buffer = null;
        String texto = "", line, fichero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el fichero a leer: ");
        fichero = sc.nextLine();

        try {
            buffer = new BufferedReader(new FileReader(fichero));
            line = buffer.readLine();
            while(line != null) {
                texto += line + "\n";
                line = buffer.readLine();
            }
        }
        catch (FileNotFoundException exception) {
            try {
                buffer = new BufferedReader(new FileReader("prueba.txt"));
                line = buffer.readLine();
                while(line != null) {
                    texto += line + "\n";
                    line = buffer.readLine();
                }
            }
            catch (IOException ex) {
                System.out.println(ex);
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
        finally {
            if(buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println(texto);
    }
}