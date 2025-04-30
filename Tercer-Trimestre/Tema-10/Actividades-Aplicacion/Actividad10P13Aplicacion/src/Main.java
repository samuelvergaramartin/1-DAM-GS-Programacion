import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        registrarEnLista("lista1.txt", lista);
        registrarEnLista("lista2.txt", lista);

        lista.sort(Comparator.naturalOrder());

        escribirListaEnFichero("lista3.txt", lista);

        System.out.println("Se han escrito los números ordenados en el fichero lista3.txt");
    }

    private static void registrarEnLista(String fichero, List<Integer> lista) {
        Scanner sc;
        String linea;
        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P13Aplicacion/" + fichero))) {
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
    }

    private static void escribirListaEnFichero(String fichero, List<Integer> lista) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter("Actividad10P13Aplicacion/" + fichero))) {
            for(Integer i : lista) {
                out.write(i.toString());
                out.newLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}