package ejercicio8p13aplicacion;

/**
 *
 * @author Samuel Vergara Martin
 */
public class CajaCarton extends Caja{
    private double superficieTotal;
    private double volumen;
    CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
    }
    
    double getSuperficieTotal() {
        superficieTotal = (2 * this.ancho * this.alto) + (2 * this.ancho * this.fondo) + (2 * this.alto * this.fondo);
        return superficieTotal;
    }
    
    @Override
    public double getVolumen() {
        volumen = super.getVolumen() * 0.8;
        return volumen;
    }
}
