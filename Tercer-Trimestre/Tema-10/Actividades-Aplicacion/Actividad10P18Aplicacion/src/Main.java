import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "", linea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba aquí: ");
        linea = sc.nextLine();

        while(!linea.equals("fin")) {
            texto+= linea + "\n";
            System.out.print("Escriba aquí: ");
            linea = sc.nextLine();
        }

        System.out.println(Arrays.toString(leerEnteros(texto)));
    }

    private static Integer[] leerEnteros(String texto) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(texto);

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                lista.add(sc.nextInt());
            }
            sc.next();
        }

        return lista.toArray(new Integer[0]);
    }
}