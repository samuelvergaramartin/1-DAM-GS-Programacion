package ejercicio7p13aplicacion;
import static netcat_utils.Colors.*;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Colores {
    private final int maxColores = 7;
    private final String[] colores = { RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE };
    private final String[] mColores = { "Rojo", "Verde", "Amarillo", "Azul", "Morado", "Cyan", "Blanco" };
    
    Colores() {};
    
    String[] getRandomColors() {
        String tablaColores[] = new String[(int) (Math.random() * (this.maxColores + 1))];
        int posicionesEscogidas[] = new int[tablaColores.length];
        int x;
        for(int i = 0; i < posicionesEscogidas.length; i++) {
            posicionesEscogidas[i] = -1;
        }
        for(int i = 0; i < tablaColores.length; i++) {
            boolean control = false;
            
            do {
                x = (int) (Math.random() * (tablaColores.length));
                for(int z = 0; z < posicionesEscogidas.length; z++) {
                    if(posicionesEscogidas[z] == x) {
                        z = posicionesEscogidas.length;
                        control = true;
                    }
                }
                if(control == false) posicionesEscogidas[i] = x;
            } while(control == false);
            //System.out.println(java.util.Arrays.toString(posicionesEscogidas));
            //posicionesEscogidas[i] = x;
            tablaColores[i] = this.colores[x];
            tablaColores[i] = this.colores[x] + this.mColores[x] + RESET;
        }
        return tablaColores;
    }
    
    String[] getRandomColors(int n) {
        int nColores;
        if(n > this.maxColores) {
            System.out.println(RED + "ERROR: El numero de colores introducido es superior al maximo.");
            nColores = (int) (Math.random() * (this.maxColores + 1));
        }
        else nColores = n;
        String tablaColores[] = new String[nColores];
        int posicionesEscogidas[] = new int[tablaColores.length];
        for(int i = 0; i < tablaColores.length; i++) {
            boolean control = false;
            int x;
            do {
                x = (int) (Math.random() * (tablaColores.length));
                for(int z = 0; z < posicionesEscogidas.length; z++) {
                    if(posicionesEscogidas[z] == x) {
                        z = posicionesEscogidas.length;
                        control = true;
                    }
                }
            } while(control == false);
            posicionesEscogidas[i] = x;
            tablaColores[i] = this.colores[x] + this.mColores[x] + RESET;
        }
        return tablaColores;
    }
}
