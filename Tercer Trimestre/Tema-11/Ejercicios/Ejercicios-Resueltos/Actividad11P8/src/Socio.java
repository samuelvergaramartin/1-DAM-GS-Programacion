import java.io.Serializable;

public class Socio implements Serializable {
    private String nombre;
    private String dni;

    Socio(String dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\nNombre: " + nombre;
    }
}
