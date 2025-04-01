import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente>{
    private final String DNI;
    private String nombre;
    private final LocalDate FECHA_NACIMIENTO;

    public Cliente(String DNI, String nombre, String FECHA_NACIMIENTO) {
        this.DNI = DNI;
        setNombre(nombre);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.FECHA_NACIMIENTO = LocalDate.parse(FECHA_NACIMIENTO, f);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    public int edad() {
        return (int) FECHA_NACIMIENTO.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tDNI: " + DNI + "\n\tEdad: " + edad() + "\n}";
    }

    @Override
    public int compareTo(Cliente o) {
        return DNI.compareTo(o.DNI);
    }
}
