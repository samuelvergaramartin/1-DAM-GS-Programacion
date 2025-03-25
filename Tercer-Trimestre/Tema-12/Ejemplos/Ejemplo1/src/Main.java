import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cliente clientes[] = {
            new Cliente("123", "Hector"),
            new Cliente("543", "Manolo"),
            new Cliente("234", "Estefania")
        };

        System.out.println(Arrays.toString(clientes));
        Arrays.sort(clientes);
        System.out.println("ORDENADO");
        System.out.println(Arrays.toString(clientes));

        Comparator<Cliente> ordenNatural = Comparator.naturalOrder();

        Arrays.sort(clientes, ordenNatural.reversed());
    }
}