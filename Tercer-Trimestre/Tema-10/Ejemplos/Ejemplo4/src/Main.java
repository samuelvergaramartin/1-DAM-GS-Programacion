import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedWriter out = null;

        //Apertura con recursos
        try(BufferedWriter out2 = new BufferedWriter(new FileWriter("Ejemplo4/texto.txt"))) {
            out2.write("Prueba de escritura2");
            out2.newLine();
            out2.write("Nueva linea2.");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            out = new BufferedWriter(new FileWriter("Ejemplo4/texto.txt"));
            out.write("Prueba de escritura");
            out.newLine();
            out.write("Nueva linea.");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}