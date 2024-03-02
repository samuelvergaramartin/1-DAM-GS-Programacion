package ejercicio7p10;
import java.time.LocalDate;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Locomotora {
    String matricula;
    double potenciaMotores;
    LocalDate fechaCreacion;
    Mecanico mecanico;
    
    public Locomotora(String matricula, double potenciaMotores, LocalDate fechaCreacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potenciaMotores = potenciaMotores;
        this.fechaCreacion = fechaCreacion;
        this.mecanico = mecanico;
    }
}
