import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Cliente> clientes = new TreeSet<>(new ComparaEdades());

        clientes.add(new Cliente("123", "A", "10-10-2010"));
        clientes.add(new Cliente("1234", "C", "10-10-2011"));
        clientes.add(new Cliente("12345", "B", "10-10-2009"));

        System.out.println("Ordenados por edad");
        System.out.println(clientes);

        clientes = new TreeSet<>(new ComparaNombres());

        clientes.add(new Cliente("123", "A", "10-10-2010"));
        clientes.add(new Cliente("1234", "C", "10-10-2011"));
        clientes.add(new Cliente("12345", "B", "10-10-2009"));

        System.out.println("Ordenados por nombres");
        System.out.println(clientes);


    }
}