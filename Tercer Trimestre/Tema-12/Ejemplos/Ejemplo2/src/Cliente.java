public class Cliente implements Comparable<Cliente> {
    String dni;
    String nombre;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + " DNI: " + dni;
    }
}
