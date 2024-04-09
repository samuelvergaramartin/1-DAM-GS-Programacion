package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Acorazado extends Barco{
    private final String cabeceraCodigo = "Ac-";
    private int numCaniones; //Numero de Cañones.
    
    public Acorazado(int numBarco, int longitudBarco) {
        super();
        super.setCodigo(cabeceraCodigo + numBarco);
        super.setLongitud(longitudBarco);
    }
    
    @Override
    public String getCodigo() {
        return super.getCodigo();
    }
    
    @Override
    public int getLongitud() {
        return super.getLongitud();
    }
    
    public void setCaniones(int numCaniones) {
        this.numCaniones = numCaniones;
    }
    
    public int getCaniones() {
        return numCaniones;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumero de Cañones: " + numCaniones;
    }
}
