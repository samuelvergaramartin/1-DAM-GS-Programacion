package embarcaciones;

public class Submarino extends Barco {

    public Submarino(double longitud) {
        super("Sub-", longitud);
    }

    public double obtenerLongitudPeriscopio() {
        return longitud / 10.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\tLongitud Periscopio: " + obtenerLongitudPeriscopio() + "\n}";
    }
}
