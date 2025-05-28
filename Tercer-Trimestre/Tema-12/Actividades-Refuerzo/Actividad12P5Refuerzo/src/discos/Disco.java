package discos;

public abstract class Disco implements Comparable<Disco> {
    private static int numeroDiscos;
    final String CODIGO;
    String nombre, autor;

    static {
        numeroDiscos = 0;
    }

    public Disco(String tipo, String nombre, String autor) {
        CODIGO = tipo + (++numeroDiscos);
        setNombre(nombre);
        setAutor(autor);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Disco)) return false;

        return CODIGO.equals(((Disco) obj).CODIGO);
    }


    @Override
    public int compareTo(Disco o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tCódigo: " + CODIGO + "\n\tNombre: " + nombre + "\n\tAutor: " + autor + "\n}";
    }
}
