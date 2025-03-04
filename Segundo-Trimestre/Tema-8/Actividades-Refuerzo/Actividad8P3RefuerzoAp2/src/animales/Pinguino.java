package animales;

import tiposAnimales.Ave;

public class Pinguino extends Ave {

    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    public void nadar() {
        System.out.println("El pinguino esta nadando...");
    }

    public void pescar() {
        System.out.println("El pinguino esta pescando");
    }

    public void darPicotazo() {
        System.out.println("El pinguino te dio un picotazo");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
