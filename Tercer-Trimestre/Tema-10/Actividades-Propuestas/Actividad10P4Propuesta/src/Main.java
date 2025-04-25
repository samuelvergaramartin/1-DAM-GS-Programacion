import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        String linea;

        try {
            out = new BufferedWriter(new FileWriter("Actividad10P4Propuesta/fichero.txt"));

            System.out.print("Introduzca un texto: ");
            linea = sc.nextLine();

            while (!linea.equals("fin")) {
                out.write(linea + "\n");
                System.out.print("Introduzca un texto: ");
                linea = sc.nextLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}