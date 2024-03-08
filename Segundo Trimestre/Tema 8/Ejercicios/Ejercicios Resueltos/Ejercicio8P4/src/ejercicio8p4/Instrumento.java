package ejercicio8p4;

/**
 *
 * @author Samuel Vergara Martín
 */
public abstract class Instrumento {
    protected Notas[] melodia;
    public Instrumento() {
        melodia = new Notas[0];
    }
    void add(Notas nota) {
        melodia = java.util.Arrays.copyOf(melodia, melodia.length +1);
        melodia[melodia.length - 1] = nota;
    }
    
    abstract void interpretar();
}
