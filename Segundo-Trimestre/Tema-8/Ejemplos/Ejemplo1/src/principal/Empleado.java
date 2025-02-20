package principal;

public class Empleado extends Persona {
    double salario;

    public Empleado(String nombre, byte edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Talla: " + "Algo");
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Empleado)) return false;

        Empleado otro = (Empleado) obj;
        return otro.nombre.equals(nombre);
    }

    @Override
    public String toString() {
        String cad = super.toString();
        cad+= "\nSalario: " + salario;
        return cad;
    }
}
