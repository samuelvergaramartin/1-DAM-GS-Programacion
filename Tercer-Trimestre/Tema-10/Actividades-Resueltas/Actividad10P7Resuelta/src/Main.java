import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String linea;
        Scanner sc;

        try(BufferedWriter out = new BufferedWriter(new FileWriter("Actividad10P7Resuelta/fichero.txt"))) {
            linea = "En un lugar de La Mancha ,";
            sc = new Scanner(linea);
            while (sc.hasNext()) {
                out.write(sc.next() + " ");
            }
            out.newLine();
            out.write("de cuyo nombre no quiero acordarme.");

            System.out.println("Se ha escrito en el fichero");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}