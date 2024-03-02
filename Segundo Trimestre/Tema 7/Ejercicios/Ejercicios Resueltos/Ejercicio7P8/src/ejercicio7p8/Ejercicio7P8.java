package ejercicio7p8;
import java.util.Arrays;;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM sintonizador = new SintonizadorFM(80);
        double validOptions[] = sintonizador.posiblesFrencuencias();
        
        sintonizador.showFrequence();
        
        sintonizador.increaseFrequence(1.5);
        
        sintonizador.showFrequence();
        
        sintonizador.decreaseFrequence(0.5);
        
        sintonizador.showFrequence();
    }
    
}
