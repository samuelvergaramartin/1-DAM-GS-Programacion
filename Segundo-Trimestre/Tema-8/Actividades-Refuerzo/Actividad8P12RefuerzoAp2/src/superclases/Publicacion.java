package superclases;

public abstract class Publicacion {
    protected String ISBN;
    protected String titulo;
    protected int anioPublicacion;

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion < 0) System.out.println("Error: El año de publicacion debe ser un numero positivo");
        else this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN +", título: " + titulo + ": " + anioPublicacion;
    }
}
