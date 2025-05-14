package embarcaciones;

public class Acorazado extends Barco {

    private int numCaniones;

    public Acorazado(double longitud, int numCaniones) {
        super("Ac-", longitud);
        setNumCaniones(numCaniones);
    }

    public void setNumCaniones(int numCaniones) {
        if(numCaniones >= 0) this.numCaniones = numCaniones;
    }

    @Override
    public String toString() {
        return super.toString().replace("Barco", getClass().getSimpleName()) + "\r\tNúmero de cañones: " + numCaniones + "\n}";
    }
}
