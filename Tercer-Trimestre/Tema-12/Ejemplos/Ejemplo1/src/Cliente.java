public class Cliente implements Comparable<Cliente>{
    String dni, nombre;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + "\n";
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }
}
