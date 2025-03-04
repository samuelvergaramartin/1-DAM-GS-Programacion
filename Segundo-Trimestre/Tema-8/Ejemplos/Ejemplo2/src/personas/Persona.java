package personas;

public class Persona {
    protected String nombre;
    protected final String DNI;
    public final static String genero = "Homo Sapiens";
    public int edad = 10;

    public Persona(String DNI, String nombre, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " DNI: " + DNI;
    }
}
