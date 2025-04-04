public class Academico implements Comparable<Academico> {
    private String nombre;
    private int anioIngreso;

    public Academico(String nombre, int anioIngreso) {
        setNombre(nombre);
        setAnioIngreso(anioIngreso);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnioIngreso(int anioIngreso) {
        if(anioIngreso > 0) {
            this.anioIngreso = anioIngreso;
        }
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tAño de ingreso: " + anioIngreso + "\n}";
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }
}
