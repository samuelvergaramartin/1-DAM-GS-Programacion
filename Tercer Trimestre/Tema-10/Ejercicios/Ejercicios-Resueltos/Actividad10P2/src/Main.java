import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        String texto = "";

        try {
            in = new FileReader("Actividad10P1/src/Main.java");
            int c = in.read();
            while (c!= -1) {
                texto += (char) c;
                c = in.read();
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                }
                catch(IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println(texto);
    }
}