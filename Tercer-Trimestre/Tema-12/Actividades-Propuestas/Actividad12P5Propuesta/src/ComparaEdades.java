import java.util.Comparator;

public class ComparaEdades implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.edad() - o2.edad();
    }
}
