package ejercicio8p12aplicacion;

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
        this.etiqueta = etiqueta;
    }
}
