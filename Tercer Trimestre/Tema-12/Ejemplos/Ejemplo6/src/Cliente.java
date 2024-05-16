import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente> {
    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object ob) {
        return dni.equals(((Cliente) ob).dni);
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad() + "\n";
    }
}
