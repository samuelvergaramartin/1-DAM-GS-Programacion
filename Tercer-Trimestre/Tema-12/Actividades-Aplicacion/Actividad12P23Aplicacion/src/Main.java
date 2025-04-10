import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>();
        String nombre;

        System.out.print("Introduce un nombre: ");
        nombre = sc.nextLine();

        while(!nombre.equals("fin")) {
            nombres.add(nombre);
            System.out.print("Introduce un nombre: ");
            nombre = sc.nextLine();
        }

        System.out.println(nombres);
    }
}