package principal;

import superclases.Publicacion;

public class Revista extends Publicacion {

    private final int numero;

    public Revista(String ISBN, String titulo, int anioPublicacion, int numero) {
        this.ISBN = ISBN;
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);

        if(numero < 0) {
            System.out.println("Error: El numero debe ser mayor o igual que 0.");
            this.numero = 0;
        }
        else this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
