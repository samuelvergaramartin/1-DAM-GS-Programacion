import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        Scanner sc;
        String linea;
        double suma = 0, num;

        try  {
            in = new BufferedReader(new FileReader("numeros.txt"));
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                if(sc.hasNextDouble()) {
                    num = sc.nextDouble();
                    suma += num;
                }

                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("No se puede cerrar el fichero");
                }
            }
        }

        System.out.println(suma);
    }
}