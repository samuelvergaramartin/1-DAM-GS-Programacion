import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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

        System.out.println("Tamaño de la colección: " + cc.size());
        System.out.println("Colección vacia\n" + cc.isEmpty());
        System.out.println("Añadimos elementos a la colección");
        cc.add(new Cliente("1", "Pepe", "07-05-1978"));
        cc.add(new Cliente("23", "Rosa", "08-09-1998"));
        cc.add(new Cliente("5", "Mario", "17-07-2000"));
        System.out.println("Tamaño de la colección: " + cc.size());
        System.out.println("Colección vacia\n" + cc.isEmpty());

        System.out.println("Comprobamos si la colección contiene el dni 5:\n\n");
        System.out.println(cc.contains(new Cliente("25", "Mario", "17-07-2000")));
        System.out.println("Comprobamos si la colección contiene el dni 5:\n\n");
        System.out.println(cc.contains(new Cliente("5", "Mario", "17-07-2000")));
        Cliente p;
        System.out.println("Iterador...");
        Iterator<Cliente> it = cc.iterator();
        while(it.hasNext()) {
            p = it.next();
            System.out.println(p);
        }
        System.out.println("Borramos de la coleccion aquellos clientes nacidos antes del 2000");
        //Creo otro iterador porq el anterior apunta al final de la colección
        it = cc.iterator();
        while(it.hasNext()) {
            p = it.next();
            if(p.fechaNacimiento.compareTo(LocalDate.of(2000, 1, 1)) < 0) {
                it.remove();
            }
        }

        System.out.println(cc);
    }
}