import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedReader out = null;
        Scanner sc;
        String contenidoFichero, fichero;

        System.out.print("Introduzca el nombre del fichero: ");


        try {

        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static String pedirFichero() {
        String fichero = null;
        Scanner sc = new Scanner(System.in);
        BufferedReader in;

        do {
            System.out.print("Introduzca el nombre del fichero: ");
            fichero = sc.nextLine();

            try {
                in = new BufferedReader(new FileReader(fichero));
            }
            catch (IOException ex) {
                fichero = null;
            }
        }
        while (fichero == null);

        return fichero;
    }
}