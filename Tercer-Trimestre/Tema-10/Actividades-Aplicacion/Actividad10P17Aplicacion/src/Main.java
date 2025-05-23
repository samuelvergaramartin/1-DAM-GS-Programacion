import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String linea;
        Scanner sc = new Scanner(System.in);
        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P17Aplicacion/fichero.txt"))) {
            linea = in.readLine();

            while(linea != null) {
                System.out.print("--Pulse intro para ver la siguiente linea--\r");
                sc.nextLine();
                System.out.println(linea);

                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}