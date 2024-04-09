package Coleccion;
import Embarcaciones.*;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Flota {
    private Barco[] barcos = new Barco[10];
    
    public Flota() {};
    
    public int numeroElementos() {
        int contador = 0;
        for(int i = 0; i < barcos.length; i++) {
            if(barcos[i] != null) contador++;
        }
        return barcos.length;
    }
    
    public  boolean insertarBarco(Barco b) {
        boolean result = true;
        for(int i = 0; i < barcos.length; i++) {
            if(barcos[i].getCodigo() == b.getCodigo() || barcos[i].getLongitud() == b.getLongitud()) result = false;
        }
        if(result) {
            boolean hecho = false;
            if(b instanceof Acorazado) {
                Acorazado barcoAcorazadoAIntroducir = (Acorazado) b;
                for(int i = 0; i < barcos.length; i++) {
                    if(barcos[i] == null && !hecho) barcos[i] = barcoAcorazadoAIntroducir;
                }
            }
            if(b instanceof Submarino) {
                Submarino barcoSubmarinoAIntroducir = (Submarino) b;
                for(int i = 0; i < barcos.length; i++) {
                    if(barcos[i] == null && !hecho) barcos[i] = barcoSubmarinoAIntroducir;
                }
            }
        }
        return result;
    }
    public boolean eliminarBarco(Barco b) {
        boolean result = false;
        for(int i = 0; i < barcos.length; i++) {
            if(barcos[i].getCodigo() == b.getCodigo() || barcos[i].getLongitud() == b.getLongitud()) {
                result = true;
                barcos[i] = null;
            };
        }
        return result;
    }
    public Barco[] arrayBarcos() {
        return barcos;
    }
}
