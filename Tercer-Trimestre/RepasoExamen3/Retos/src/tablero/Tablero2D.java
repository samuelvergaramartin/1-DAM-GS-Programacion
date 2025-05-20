package tablero;

import ejercito.Ejercito;
import personajes.Personaje;

import java.util.Arrays;

public class Tablero2D {
    private String[][] tablero;

    public Tablero2D(Ejercito ejercito1, Ejercito ejercito2) {
        tablero = new String[3][3];
        for(int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], "    ");
        }
        colocarPersonajes(ejercito1, ejercito2);
    }

    public void colocarPersonajes(Ejercito ejercito1, Ejercito ejercito2) {
        Personaje personaje;
        for(int i = 0; i < ejercito1.tamanyoEjercito(); i++) {
            personaje = ejercito1.obtenerPersonaje(i);
            tablero[personaje.getPosTableroY()][personaje.getPosTableroX()] = "E1" + personaje.getCODIGO();
        }
        for(int i = 0; i < ejercito2.tamanyoEjercito(); i++) {
            personaje = ejercito2.obtenerPersonaje(i);
            tablero[personaje.getPosTableroY()][personaje.getPosTableroX()] = "E2" + personaje.getCODIGO();
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
