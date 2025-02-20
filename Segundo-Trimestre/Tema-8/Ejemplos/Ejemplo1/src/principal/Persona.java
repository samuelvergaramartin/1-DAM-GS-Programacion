package principal;

public class Persona {
    protected  String nombre;
    private byte edad;
    double altura;


    public Persona(String nombre, byte edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    };

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String toString() {
        String cad = "Nombre: " + nombre + "\nEdad: " + edad;
        return cad;
    }
}
