import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea;
        Scanner sc;
        int contEdades = 0, contEstaturas = 0;
        double mediaEdades = 0, mediaEstaturas = 0;

        try {
            in = new BufferedReader(new FileReader("Actividad10P3Propuesta/Jugadores.txt"));

            linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea);
                sc.useLocale(Locale.US);

                if (sc.hasNext()) {
                    System.out.println(sc.next());
                }

                if(sc.hasNextInt()) {
                    contEdades++;
                    mediaEdades += sc.nextDouble();
                }

                if(sc.hasNextDouble()) {
                    contEstaturas++;
                    mediaEstaturas += sc.nextDouble();
                }

                linea = in.readLine();
            }

            if(contEdades > 0) {
                mediaEdades /= contEdades;
            }

            if(contEstaturas > 0) {
                mediaEstaturas /= contEstaturas;
            }

            System.out.printf("Media de edades: %.2f\n", mediaEdades);
            System.out.printf("Media de estaturas: %.2f", mediaEstaturas);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}