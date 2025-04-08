import java.util.Comparator;

public class ComparaAntiguedades implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.antiguedad() - o2.antiguedad();
    }
}
