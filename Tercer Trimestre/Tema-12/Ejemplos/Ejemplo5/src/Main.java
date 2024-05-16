import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<>();

        lista.add(new Cliente("543", "Marcos", "12-11-2000"));
        lista.add(new Cliente("121", "Claudia", "11-11-2000"));
        lista.add(new Cliente("777", "Marcos", "15-11-2000"));

        Collections.sort(lista);

        System.out.println(lista);
    }
}