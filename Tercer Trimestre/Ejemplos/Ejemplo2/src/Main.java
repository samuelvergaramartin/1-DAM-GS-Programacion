import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;

        try {
            in = new FileReader("/etc/hostname");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("No se puede cerrar el fichero.");
                }
            }
        }
    }
}