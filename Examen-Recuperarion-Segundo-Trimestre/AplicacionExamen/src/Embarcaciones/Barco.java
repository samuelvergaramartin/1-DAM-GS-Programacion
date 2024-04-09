package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public abstract class Barco {
    private String codigo;
    private int longitud;
    
    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    protected void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getLongitud() {
        return longitud;
    }
    
    @Override
    public String toString() {
        return "Codigo del barco: " + codigo + "\nLongitud del barco: " + longitud;
    }
}
