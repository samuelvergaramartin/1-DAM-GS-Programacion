import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            lista.add(sc.nextInt());
        }

        lista.sort(Comparator.naturalOrder());

        System.out.println(lista);
    }
}