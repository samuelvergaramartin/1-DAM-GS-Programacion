import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {
    private final int ID;
    private String nombre;
    private final LocalDate FECHA_NACIMIENTO;

    public Socio(int ID, String nombre, String FECHA_NACIMIENTO) {
        this.ID = ID;
        setNombre(nombre);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.FECHA_NACIMIENTO = LocalDate.parse(FECHA_NACIMIENTO, f);
    }

    public int getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    public int edad() {
        return (int) FECHA_NACIMIENTO.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object o) {
        return edad() - ((Socio) o).edad();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tID: " + ID + "\n\tNombre: " + nombre + "\n\tEdad: " + edad() + "\n}";
    }
}
