package alumnos;

public class Alumnado {
    private static int numeroAlumnos;
    final int NIE;
    String nombre;

    static {
        numeroAlumnos = 0;
    }

    public Alumnado(String nombre) {
        NIE = ++numeroAlumnos;
        setNombre(nombre);
    }

    public int getNIE() {
        return NIE;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Alumnado)) return false;

        return ((Alumnado)obj).NIE == NIE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNIE: " + NIE + "\n\tNombre: " + nombre + "\n}";
    }
}
