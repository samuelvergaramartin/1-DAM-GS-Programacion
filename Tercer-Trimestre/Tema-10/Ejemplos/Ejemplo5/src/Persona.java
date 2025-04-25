import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tApellido: " + apellido + "\n\tEdad: " +edad + "\n}";
    }
}
