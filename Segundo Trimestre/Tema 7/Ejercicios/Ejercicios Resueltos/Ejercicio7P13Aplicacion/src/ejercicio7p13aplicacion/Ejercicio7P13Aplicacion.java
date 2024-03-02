package ejercicio7p13aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P13Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColoresDos colores = new ColoresDos();
        String[] coloresRandom;
        coloresRandom = colores.getColoresRandom(4);
        System.out.println(java.util.Arrays.toString(coloresRandom));
    }
    
}
