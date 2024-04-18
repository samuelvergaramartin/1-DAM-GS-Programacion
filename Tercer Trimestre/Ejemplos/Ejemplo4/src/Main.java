import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader input = null;
        String texto = "";
        int c;

        try {
            input = new FileReader("example.txt");
            c = input.read();
            while(c != -1) {
                texto += (char) c;
                c = input.read();
            }
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            if(input != null) {
                try {
                    input.close();
                } catch (IOException exception) {
                    System.err.println("ERROR: Error al cerrar el archivo: " + exception.getMessage());
                }
            }
        }

        System.out.println(texto);
    }
}