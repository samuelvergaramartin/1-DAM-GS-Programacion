package actividadpopuesta9p5;

import java.util.Arrays;

/**
 *
 * @author Samuel Vergara Martín
 */
public class ActividadPopuesta9P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio socios[] = {
            new Socio(1, "Pedro Vazquez", "01-01-2001"),
            new Socio(2, "Alex Navas", "09-04-2024")
        };
        
        ComparaNombres comparador = new ComparaNombres();
        int result = comparador.compare(socios[0], socios[1]);
        
        System.out.println(result);
    }
    
}
