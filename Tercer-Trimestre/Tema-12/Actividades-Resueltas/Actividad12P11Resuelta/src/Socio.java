import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio {
    private final String DNI;
    private String nombre;
    private final LocalDate FECHA_ALTA;

    public Socio(String DNI, String nombre, String FECHA_ALTA) {
        this.DNI = DNI;
        setNombre(nombre);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.FECHA_ALTA = LocalDate.parse(FECHA_ALTA, f);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
