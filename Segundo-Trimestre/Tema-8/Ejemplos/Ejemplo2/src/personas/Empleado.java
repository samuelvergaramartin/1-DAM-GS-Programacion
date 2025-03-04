package personas;

public class Empleado extends Persona {

    private double sueldo;
    public String edad;

    public Empleado(String nombre, String DNI, double sueldo) {
        super(DNI, nombre, 0);
        this.sueldo = sueldo;
        this.edad = "Mayor de edad";
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        String cad = super.toString();

        cad+= " Salario: " + sueldo + " Edad: " + edad;

        return cad;
    }
}
