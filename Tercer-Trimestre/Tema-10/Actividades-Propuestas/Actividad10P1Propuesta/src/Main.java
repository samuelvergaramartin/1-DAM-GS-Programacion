import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea;

        try {
            in = new BufferedReader(new FileReader("Actividad10P1Propuesta/fichero.txt"));

            linea = in.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = in.readLine();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: No se ha encontrado el fichero");
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}