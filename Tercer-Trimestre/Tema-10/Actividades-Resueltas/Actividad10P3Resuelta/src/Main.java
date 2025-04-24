import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea;

        try {
            in = new BufferedReader(new FileReader("Actividad10P3Resuelta/src/Main.java"));

            linea = in.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = in.readLine();
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