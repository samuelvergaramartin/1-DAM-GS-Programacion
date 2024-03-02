package ejercicio7p13aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class ColoresDos {
    private String[] colores = { "Rojo", "Verde", "Amarillo", "Azul", "Morado", "Cyan", "Blanco" };
    private String[] coloresFinales;
    
    ColoresDos() {};
    
    String[] getColoresRandom(int nColors) {
        this.coloresFinales = new String[nColors];
        int posicionesEscogidas[] = new int[nColors];
        for(int i = 0; i < posicionesEscogidas.length; i++) {
            boolean controlMainLoop = false;
            do {
                int index = (int) (Math.random() * 7);
                boolean control = false;
                for(int x = 0; x < posicionesEscogidas.length; x++) {
                    if(posicionesEscogidas[x] == index) control = true;
                }
                if(control == false) {
                    posicionesEscogidas[i] = index;
                    controlMainLoop = true;
                }
            } while(!controlMainLoop);
        }
        
        for(int i = 0; i < this.coloresFinales.length; i++) {
            this.coloresFinales[i] = this.colores[posicionesEscogidas[i]];
        }
        
        return this.coloresFinales;
    }
}
