package animales;

public class Animal {
    protected String nombre;
    private boolean insecto;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void sonido() {
        System.out.println("iiiiii");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
