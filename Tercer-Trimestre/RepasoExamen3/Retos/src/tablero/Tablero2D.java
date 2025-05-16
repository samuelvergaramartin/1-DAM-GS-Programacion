package tablero;

import java.util.Arrays;

public class Tablero2D {
    private String[][] tablero;

    public Tablero2D() {
        tablero = new String[3][3];
        for(int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], "    ");
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        for(int i = 0; i < tablero.length; i++) {
            resultado += Arrays.toString(tablero[i]) + "\n";
        }

        return resultado;
    }
}
