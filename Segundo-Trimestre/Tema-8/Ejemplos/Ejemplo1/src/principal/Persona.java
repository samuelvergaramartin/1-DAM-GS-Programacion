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
}
