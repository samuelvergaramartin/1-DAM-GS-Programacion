import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio> {
    private final String DNI;
    private String nombre;
    private final LocalDate FECHA_ALTA;

    public Socio(String DNI, String nombre, String FECHA_ALTA) {
        this.DNI = DNI;
        setNombre(nombre);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.FECHA_ALTA = LocalDate.parse(FECHA_ALTA, f);
    }

    public int antiguedad() {
        return (int) LocalDate.now().until(FECHA_ALTA, ChronoUnit.YEARS);
    }

    public String getDNI() {
        return DNI;
    }

    public String getFECHA_ALTA() {
        return FECHA_ALTA.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tDNI: " + DNI + "\n\tFecha de Alta: " + FECHA_ALTA + "\n}";
    }

    @Override
    public int compareTo(Socio o) {
        return DNI.compareTo(o.DNI);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Socio)) return false;

        return DNI.equals(((Socio) obj).DNI);
    }
}
