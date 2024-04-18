import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader input = null;
        String texto = "", line;

        try {
            input = new BufferedReader(new FileReader("example.txt"));
            line = input.readLine();
            while(line != null) {
                texto += line + "\n";
                line = input.readLine();
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
        finally {
            if(input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println(texto);
    }
}