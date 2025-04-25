import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fichero, contenidoFichero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca el nombre del fichero: ");
            fichero = sc.nextLine();

            try (BufferedReader in = new BufferedReader(new FileReader("Actividad10P8Resuelta/" + fichero))){}
            catch (IOException ex) {
                fichero = null;
            }

        }
        while (fichero == null);

        contenidoFichero = obtenerContenidoFichero(fichero);
        copiarFichero(contenidoFichero, fichero);
        System.out.println("Fichero copiado satisfactoriamente.");
    }

    private static String obtenerContenidoFichero(String fichero) {
        String linea, contenidoFichero = "";

        try (BufferedReader in = new BufferedReader(new FileReader("Actividad10P8Resuelta/" + fichero))){
            linea = in.readLine();

            while (linea != null) {
                contenidoFichero += linea + "\n";
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }

        return contenidoFichero;
    }

    private static void copiarFichero(String contenidoFichero, String fichero) {
        Scanner sc;
        try(BufferedWriter out = new BufferedWriter(new FileWriter("Actividad10P8Resuelta/copia_de_" + fichero))) {
            sc = new Scanner(contenidoFichero);
            while (sc.hasNextLine()) {
                out.write(sc.nextLine() + "\n");
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}