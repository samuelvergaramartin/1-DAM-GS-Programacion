package animales;

import tiposAnimales.Mamifero;

public class Lagarto extends Mamifero {

    public Lagarto(String nombre, int edad) {
        super(nombre, edad);
    }

    public void comerInsectos() {
        System.out.println("Mm, q rico");
    }

    public void cambiarDeColor() {
        System.out.println("El lagarto ha cambiado de color.");
    }

    public void sacarLengua() {
        System.out.println("El lagarto ha sacado la lengua.");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
