package animales;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Raza: " + raza + " " + super.toString();
    }
}
