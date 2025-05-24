public class Contacto {
    private String nombre, telefono;

    public Contacto(String nombre, String telefono){
        setNombre(nombre);
        setTelefono(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contacto)) return false;

        return telefono.equals(((Contacto) obj).telefono);
    }

    @Override
    public String toString() {
        return nombre + " - " + telefono + "\n";
    }
}
