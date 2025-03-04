package tiposAnimales;

import superclaseRaiz.Animal;

public class Mamifero extends Animal {

    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
    }

    public void andar() {
        System.out.println("Andando...");
    }

    public void dormir() {
        System.out.println("Zzz");
    }

    public void comer() {
        System.out.println("Comiendo...");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
