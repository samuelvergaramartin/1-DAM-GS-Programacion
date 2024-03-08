package ejercicio8p11aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public abstract class Instrumento {
    protected Nota[] melodia;
    public Instrumento() {
        melodia = new Nota[0];
    }
    void add(Nota nota) {
        melodia = java.util.Arrays.copyOf(melodia, melodia.length +1);
        melodia[melodia.length - 1] = nota;
    }
    
    abstract void interpretar();
}
