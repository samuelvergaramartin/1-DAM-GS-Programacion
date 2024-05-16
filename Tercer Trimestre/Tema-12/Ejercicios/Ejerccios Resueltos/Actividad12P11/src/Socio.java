import java.time.LocalDate;
import java.util.Comparator;

public class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    

    boolean equals(Socio o) {
        return this.equals(o);
    }

    @Override
    public int compareTo(Socio o) {
        return 0;
    }
}
