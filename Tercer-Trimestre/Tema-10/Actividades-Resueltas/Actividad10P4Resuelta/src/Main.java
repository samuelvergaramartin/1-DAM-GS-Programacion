import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea;
        double media;

        try {
            in = new BufferedReader(new FileReader("Actividad10P4Resuelta/NumerosReales.txt"));

            linea = in.readLine();

            if(linea != null) {
                media = hacerMedia(linea.split(" "));
                System.out.println("Media: " + media);
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

    private static double hacerMedia(String[] numeros) {
        double resultado = 0;

        for (String numero : numeros) {
            resultado += Double.parseDouble(numero);
        }

        return resultado / numeros.length;
    }
}