public class Cliente {
    String nombre, dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " DNI: " + dni + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cliente)) return false;

        return ((Cliente) obj).nombre.equals(nombre);
    }
}
