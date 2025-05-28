package alumnos;

import interfaces.Calculable;

public class AlumnadoNEAE extends Alumnado implements Calculable {
    private double coeficiente;

    public AlumnadoNEAE(String nombre, double coeficiente) {
        super(nombre);
        setCoeficiente(coeficiente);
    }

    public void setCoeficiente(double coeficiente) {
        if(coeficiente >= 1.0 && coeficiente <= 2.0) this.coeficiente = coeficiente;
        else this.coeficiente = 1.0;
    }

    @Override
    public double calculoNota(double notaInicial) {
        return coeficiente * notaInicial;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\tCoeficiente: " + coeficiente + "\n}";
    }
}
