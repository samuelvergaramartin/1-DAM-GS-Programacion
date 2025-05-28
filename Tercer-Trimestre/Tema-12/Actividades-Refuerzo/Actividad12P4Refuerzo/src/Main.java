import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese una palabra: ");
            lista.add(sc.nextLine());
        }

        lista.sort(Comparator.naturalOrder());

        System.out.println(lista);
    }
}