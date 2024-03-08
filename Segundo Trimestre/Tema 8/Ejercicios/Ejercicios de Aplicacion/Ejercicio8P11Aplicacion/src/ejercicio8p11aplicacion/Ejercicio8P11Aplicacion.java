package ejercicio8p11aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P11Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nota[] melodiaCampana = {Nota.SI, Nota.DO, Nota.SI, Nota.DO, Nota.SI, Nota.DO};
        Campana campana = new Campana();
        for(Nota nota: melodiaCampana) {
            campana.add(nota);
        }
        campana.interpretar();
    }
    
}
