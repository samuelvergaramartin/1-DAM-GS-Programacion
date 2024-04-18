import java.io.FileReader;
import java.io.IOException;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        FileReader input = null;
        String texto = "";
        int character;

        try {
            input = new FileReader("/etc/passwd");
            character = input.read();
            while (character != -1) {
                texto += (char) character;
                character = input.read();
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