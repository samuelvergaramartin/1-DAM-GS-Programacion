package animales;

public class Gato extends Animal{
    String raza;

    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Raza: " + raza + " " + super.toString();
    }
}
