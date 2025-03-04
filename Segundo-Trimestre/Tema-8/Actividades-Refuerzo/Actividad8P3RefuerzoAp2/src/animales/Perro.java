package animales;

import tiposAnimales.Mamifero;

public class Perro extends Mamifero {

    private String raza;

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public Perro(String nombre, int edad, String raza) {
        this(nombre, edad);
        setRaza(raza);
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void ladrar() {
        System.out.println("Guau!");
    }

    public void grunir() {
        System.out.println("Grrr");
    }

    @Override
    public String toString() {
        String cad = super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());

        cad+= "\r\tRaza: " + raza + "\n }";

        return cad;
    }
}
