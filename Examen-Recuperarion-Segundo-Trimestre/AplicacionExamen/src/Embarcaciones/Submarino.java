package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Submarino extends Barco {
    private final String cabeceraCodigo = "Sub-";
    private double longitudPeriscopio;
    
    public Submarino(int numBarco, int longitudBarco) {
        super();
        super.setCodigo(cabeceraCodigo + numBarco);
        super.setLongitud(longitudBarco);
        longitudPeriscopio = longitudBarco / 10;
    }
    
    @Override
    public String getCodigo() {
        return super.getCodigo();
    }
    
    @Override
    public int getLongitud() {
        return super.getLongitud();
    }
    
    public double getLongitudPeriscopio() {
        return longitudPeriscopio;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nLongitud del periscopio: " + longitudPeriscopio;
    }
}
