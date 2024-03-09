package ejercicio8p12aplicacion;
import static netcat_utils.Colors.CYAN;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P12Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double volumenCaja;
        String etiquetaValue;
        Caja caja = new Caja(20, 30, 50, Unidad.cm);
        volumenCaja = caja.getVolumen();
        System.out.println(CYAN + volumenCaja + " " +  Unidad.m3);
        caja.setEtiqueta("- Samuel Vergara\n- Avda Ortega");
        etiquetaValue = caja.toString();
        System.out.println(etiquetaValue);
    }
    
}
