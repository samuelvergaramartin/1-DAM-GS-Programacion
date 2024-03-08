package ejercicio8p5;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nota[] melodia = { Nota.DO, Nota.LA, Nota.SI, Nota.SOL, Nota.SI, Nota.RE };
        Piano piano = new Piano();
        for(Nota nota: melodia) {
            piano.add(nota);
        }
        piano.interpretar();
    }
    
}