import java.util.Comparator;

public class DniInverso implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.dni.compareTo(o2.dni);
    }
}
