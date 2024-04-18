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
        String nombres[] = new String[3], line, value = "";
        int edades[] = new int[3];
        double estaturas[] = new double[3], mediaEdades, mediaEstaturas, suma;


        try {
            buffer = new BufferedReader(new FileReader("Jugadores.txt"));
            line = buffer.readLine();
            while(line != null) {
                sc = new Scanner(line).useLocale(Locale.US);
                while(sc.hasNext()) {
                    if(!sc.hasNextInt() && !sc.hasNextDouble()) {
                        for(int i = 0; i < nombres.length; i++) {
                            if(nombres[i] == null) {
                                nombres[i] = sc.next();
                                i = nombres.length;
                            }
                        }
                    }
                    if(sc.hasNextInt()) {
                        for(int i = 0; i < edades.length; i++) {
                            if(edades[i] == 0) {
                                edades[i] = sc.nextInt();
                                i = edades.length;
                            }
                        }
                    }
                    if(sc.hasNextDouble()) {
                        for(int i = 0; i < estaturas.length; i++) {
                            if(estaturas[i] == 0) {
                                estaturas[i] = sc.nextDouble();
                                i = estaturas.length;
                            }
                        }
                    }
                    else sc.next();
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

        suma = 0;
        for(int i = 0; i < edades.length; i++) suma += edades[i];
        mediaEdades = suma / 2;
        suma = 0;
        for (int i = 0; i < estaturas.length; i++) suma += estaturas[i];
        mediaEstaturas = suma / 2;

        for(int i = 0; i < nombres.length; i++) {
            if(i == nombres.length - 1) value += nombres[i] + " ";
            else value += nombres[i] + ", ";

        }

        System.out.println("Jugadores: " + value + "\nMedia edades: " + mediaEdades + "\nMedia estaturas: " + mediaEstaturas);

    }
}