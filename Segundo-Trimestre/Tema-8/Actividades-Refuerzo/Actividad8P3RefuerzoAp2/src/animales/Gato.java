package animales;

import tiposAnimales.Mamifero;

public class Gato extends Mamifero {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar() {
        System.out.println("Miau");
    }

    public void jugar() {
        System.out.println("El gato está jugando");
    }

    public void mear() {
        System.out.println("El gato está meando.");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
