import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    private int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object o) {
        return nombre.compareTo(((Socio) o).nombre);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad();
    }
}
