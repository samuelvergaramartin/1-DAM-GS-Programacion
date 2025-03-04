package animales;

import tiposAnimales.Ave;

public class Canario extends Ave {

    public Canario(String nombre, int edad) {
        super(nombre, edad);
    }

    public void cantar() {
        System.out.println("Lalalala...");
    }

    public void hablar() {
        System.out.println("Soy un loro muy listo");
    }

    public void grunir() {
        System.out.println("Grrr");
    }

    @Override
    public String toString() {
        return super.toString().replace(super.getClass().getSimpleName(), getClass().getSimpleName());
    }
}
