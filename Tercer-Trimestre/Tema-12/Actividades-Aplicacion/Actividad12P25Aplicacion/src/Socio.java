import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio> {
    private final String APODO;
    private String nombre;
    private LocalDate fechaIngreso;

    public Socio(String APODO, String nombre, String fechaIngreso) {
        this.APODO = APODO;
        setNombre(nombre);
        setFechaIngreso(fechaIngreso);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaIngreso(String fechaIngreso) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    public String getFechaIngreso() {
        return fechaIngreso.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public int antiguedad() {
        return (int) fechaIngreso.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Socio)) return false;

        return ((Socio) obj).APODO.equals(APODO);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tApodo: " + APODO + "\n\tNombre: " + nombre + "\n\tFecha de ingreso: " + fechaIngreso + "\nAntigüedad: " + antiguedad() + " años\n}";
    }

    @Override
    public int compareTo(Socio o) {
        return APODO.compareTo(o.APODO);
    }
}
