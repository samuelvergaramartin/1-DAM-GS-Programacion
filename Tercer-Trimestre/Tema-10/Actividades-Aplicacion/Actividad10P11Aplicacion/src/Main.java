import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String linea, fichero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del fichero: ");
        fichero = sc.nextLine();

        if(fichero.isBlank()) fichero = "prueba.txt";

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P11Aplicacion/" + fichero))) {
            linea = in.readLine();

            while(linea != null) {
                System.out.println(linea);
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}