package superclaseRaiz;

public class Animal {

    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        if(edad < 0) System.out.println("Error: La edad no puede ser menor que 0.");
        else this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tEdad: " + edad + "\n}";
    }
}
