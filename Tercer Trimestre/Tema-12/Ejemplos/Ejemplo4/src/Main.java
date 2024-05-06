import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Collection<Cliente> cc = clientes;

        cc.add(new Cliente("1", "Pepe", "07-05-1978"));
        cc.add(new Cliente("23", "Rosa", "08-09-1998"));
        cc.add(new Cliente("25", "Mario", "17-07-2000"));

        System.out.println(cc);

        cc.remove(new Cliente("23", "Rosa", "08-09-1998"));
        System.out.println("Eliminamos a Rosa");
        System.out.println(cc);

        System.out.println("Ejecutando clear...");
        cc.clear();
        System.out.println(cc);
    }
}