package tiposAnimales;

import superclaseRaiz.Animal;

public class Ave extends Animal {

    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    public void volar() {
        System.out.println("Volando...");
    }

    public void ponerUnHuevo() {
        System.out.println("He puesto un huevo.");
    }

    public void cazar() {
        System.out.println("He cazado una presa");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
