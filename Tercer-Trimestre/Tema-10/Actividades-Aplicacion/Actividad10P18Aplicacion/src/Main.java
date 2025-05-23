import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    private static Integer[] leerEnteros(String texto) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(texto);

        while (sc.hasNextInt()) {
            lista.add(sc.nextInt());
        }

        return lista.toArray(new Integer[0]);
    }
}