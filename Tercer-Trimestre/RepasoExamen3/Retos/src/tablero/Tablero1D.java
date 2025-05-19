package tablero;

import ejercito.Ejercito;
import personajes.Personaje;
import java.util.Arrays;

@Deprecated
public class Tablero1D {
    @Deprecated
    private String[] tablero;

    @Deprecated
    public Tablero1D() {
        tablero = new String[20];
        Arrays.fill(tablero, "    ");
    }

    @Deprecated
    public Tablero1D(Ejercito ejercito1, Ejercito ejercito2) {
        this();
        colocarPersonajes(ejercito1, ejercito2);
    }

    @Deprecated
    public void moverPersonaje(int pos, Personaje enemigo) {
        int posAnterior;
        if(pos > 0 && pos <= tablero.length) {
            if(tablero[pos - 1].equals("    ")) {
                posAnterior = enemigo.getPosTablero();
                tablero[pos - 1] = tablero[posAnterior - 1];
                tablero[posAnterior - 1] = "    ";
            }
        }
    }

    @Deprecated
    public String obtenerPersonaje(int pos) {
        String resultado = "    ";
        if(pos > 0 && pos <= tablero.length) {
            resultado = tablero[pos - 1];
        }
        return resultado;
    }

    @Deprecated
    public void eliminarPersonaje(int pos) {
        tablero[pos - 1] = "    ";
    }

    @Deprecated
    public void colocarPersonajes(Ejercito ejercito1, Ejercito ejercito2) {
        Personaje personaje;
        for(int i = 0; i < ejercito1.tamanyoEjercito(); i++) {
            personaje = ejercito1.obtenerPersonaje(i);
            tablero[personaje.getPosTablero() - 1] = "E1" + personaje.getCODIGO();
        }
        for(int i = 0; i < ejercito2.tamanyoEjercito(); i++) {
            personaje = ejercito2.obtenerPersonaje(i);
            tablero[personaje.getPosTablero() - 1] = "E2" + personaje.getCODIGO();
        }
    }

    @Deprecated
    @Override
    public String toString() {
        return Arrays.toString(tablero);
    }
}
