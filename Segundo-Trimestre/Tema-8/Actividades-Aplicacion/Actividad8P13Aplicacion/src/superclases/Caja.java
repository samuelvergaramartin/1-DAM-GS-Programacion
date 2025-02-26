package superclases;

import enumerados.Unidad;

public class Caja {
    protected final int ancho, alto, fondo;
    protected String etiqueta;
    protected final Unidad unidad;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        if(ancho <= 0) {
            System.out.println("Error: La anchura debe ser mayor que 0.");
            this.ancho = 1;
        }
        else this.ancho = ancho;

        if(alto <= 0) {
            System.out.println("Error: La altura debe ser mayor que 0.");
            this.alto = 1;
        }
        else this.alto = alto;

        if(fondo <= 0) {
            System.out.println("Error: El fondo debe ser mayor que 0.");
            this.fondo = 1;
        }
        else this.fondo = fondo;

        this.unidad = unidad;
    }

    public double getVolumen() {
        return unidad.equals(Unidad.M) ? ancho*alto*fondo : (ancho*alto*fondo)/100.0;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        String resultado = getClass().getSimpleName() + " {\n\t";

        resultado+= "Ancho: " + ancho + "\n\t";
        resultado+= "Alto: " + alto + "\n\t";
        resultado+= "Fondo: " + fondo + "\n\t";
        resultado+= "Unidad de medida: " + unidad + "\n\t";
        resultado+= "Volumen: " + getVolumen() + " m3\n\t";
        resultado+= "Etiqueta: " + etiqueta + "\n}";

        return resultado;
    }
}
