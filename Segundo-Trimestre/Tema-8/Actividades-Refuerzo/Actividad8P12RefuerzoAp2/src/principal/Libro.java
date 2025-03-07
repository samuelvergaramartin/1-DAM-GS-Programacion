package principal;

import interfaces.Prestable;
import superclases.Publicacion;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String ISBN, String titulo, int anioPublicacion) {
        this.ISBN = ISBN;
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
    }

    @Override
    public void presta() {
        if(prestado) System.out.println("Lo siento, ese libro ya está prestado.");
        else prestado = true;
    }

    @Override
    public void devuelve() {
        if(!prestado) System.out.println("Lo siento, pero el libro no está prestado.");
        else prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (estaPrestado() ? "(prestado)" : "(no prestado)");
    }
}
