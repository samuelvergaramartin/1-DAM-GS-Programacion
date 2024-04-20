import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader buffer = null;
        Scanner sc;
        String line, jugadores = "";
        double mediaEdades, mediaEstaturas, sumaEdades = 0, sumaEstaturas = 0;


        try {
            buffer = new BufferedReader(new FileReader("Jugadores.txt"));
            line = buffer.readLine();
            while(line != null) {
                sc = new Scanner(line).useLocale(Locale.US);
                while(sc.hasNext()) {
                    if(!sc.hasNextInt() && !sc.hasNextDouble()) jugadores += sc.next() + " ";
                    if(sc.hasNextInt()) sumaEdades += sc.nextInt();
                    if(sc.hasNextDouble()) sumaEstaturas += sc.nextDouble();
                }
                line = buffer.readLine();
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
        finally {
            if(buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        mediaEdades = sumaEdades / 2;
        mediaEstaturas = sumaEstaturas / 2;

        System.out.println("Jugadores: " + jugadores + "\nMedia edades: " + mediaEdades + "\nMedia estaturas: " + mediaEstaturas);

    }
}