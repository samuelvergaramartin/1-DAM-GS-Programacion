package principal;

import enumerados.Unidad;
import superclases.Caja;

public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
    }

    @Override
    public double getVolumen() {
        return 0.8 * super.getVolumen();
    }

    public double getSuperficie() {
        return 2*(ancho*alto) + 2*(fondo*alto) + 2*(fondo*alto);
    }

    @Override
    public String toString() {
        return super.toString() + "\r\tSuperficie: " + getSuperficie() + " cm2\n}";
    }
}
