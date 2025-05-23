import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min, max;
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc;
        String linea;

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P15Aplicacion/numeros.txt"))) {
            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea);
                lista.add(sc.nextInt());

                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        min = Collections.min(lista);
        max = Collections.max(lista);

        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }
}