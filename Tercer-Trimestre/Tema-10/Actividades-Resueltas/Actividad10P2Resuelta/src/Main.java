import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        int linea;

        try {
            in = new FileReader("Actividad10P2Resuelta/src/Main.java");
            linea = in.read();

            while(linea != -1) {
                System.out.println((char)linea);
                linea = in.read();
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}