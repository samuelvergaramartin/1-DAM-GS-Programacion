package actividad9p11aplicacion;
import java.util.Arrays;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Lista {
    private Integer[] tabla;
    
    Lista() {
        tabla = new Integer[0];
    }
    
    int getTotalElementos() {
        return tabla.length;
    }
    
    int getRealTotalElementos() {
        int result = 0;
        for(int i = 0; i < tabla.length; i++) {
            if(tabla[i] != null) result++;
        }
        return result;
    }
}
