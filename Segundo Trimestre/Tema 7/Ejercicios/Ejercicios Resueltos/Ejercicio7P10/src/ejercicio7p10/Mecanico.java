package ejercicio7p10;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Mecanico {
    String nombre;
    long telefono;
    private enum Especialidades { frenos, hidraulica, electricidad, motor };
    Especialidades especialidad;
    
    Mecanico(String nombre, long telefono, Especialidades especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    
}
