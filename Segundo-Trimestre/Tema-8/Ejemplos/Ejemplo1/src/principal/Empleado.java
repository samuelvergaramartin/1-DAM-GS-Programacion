package principal;

public class Empleado extends Persona {
    double salario;
    String estatura;

    public Empleado(String nombre, byte edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }
}
