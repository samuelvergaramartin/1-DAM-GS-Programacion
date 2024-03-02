package ejercicio7p10;
import java.time.LocalDate;
/**
 *
 * @author Samuel Vergara Martín
 */
public class JefeEstacion {
    String nombre;
    String dni;
    LocalDate fechaNombramientoJefeEstacion;
    
    JefeEstacion(String nombre, String dni, LocalDate fechaNombramientoJefeEstacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramientoJefeEstacion = fechaNombramientoJefeEstacion;
    }
}
