package ejercicio8p13aplicacion;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.Colors.RED;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;
    private String etiqueta;
    
    protected Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    
    protected double getVolumen() {
        double resultado = this.ancho * this.alto * this.fondo;
        return resultado;
    }
    
    protected void setEtiqueta(String etiqueta) {
        if(etiqueta.length() > 30) System.out.println(RED + "ERROR: Escriba una etiqueta nueva. El limite de carcacteres maximos es 30!");
        else this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString() {
        String resultado = CYAN + "Ancho: " + this.ancho + this.unidad + "\n" + "Alto: " + this.alto + this.unidad + "\n" + "Fondo: " + this.fondo + this.unidad + "\n" + "Etiqueta: " + this.etiqueta;
        return resultado;
    }
}
