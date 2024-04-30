import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cliente clientes[] = {
          new Cliente("1", "Pepe"),
          new Cliente("2", "Rosa"),
          new Cliente("20", "Carlos"),
          new Cliente("10", "Maria")
        };

        Comparator<Cliente> orden = Comparator.naturalOrder();

        Arrays.sort(clientes, orden.reversed());
        System.out.println(Arrays.toString(clientes));

        Arrays.sort(clientes, new ComparaNombres());
        System.out.println(Arrays.toString(clientes));

        Arrays.sort(clientes, new ComparaNombres().reversed());
        System.out.println(Arrays.toString(clientes));
    }
}