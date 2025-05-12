import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int contCaracteres = 0, contLineas = 0, contPalabras = 0;
        String contenidoCarta = "";

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P14Aplicacion/carta.txt"))) {

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}