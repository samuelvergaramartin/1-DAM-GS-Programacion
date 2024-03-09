package ejercicio8p12aplicacion;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.Colors.RED;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Caja {
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    private String etiqueta;
    
    Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    
    double getVolumen() {
        double resultado = this.ancho * this.alto * this.fondo;
        return resultado;
    }
    
    void setEtiqueta(String etiqueta) {
        if(etiqueta.length() > 30) System.out.println(RED + "ERROR: Escriba una etiqueta nueva. El limite de carcacteres maximos es 30!");
        else this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString() {
        String resultado = CYAN + "Ancho: " + this.ancho + this.unidad + "\n" + "Alto: " + this.alto + this.unidad + "\n" + "Fondo: " + this.fondo + this.unidad + "\n" + "Etiqueta: " + this.etiqueta;
        return resultado;
    }
}
