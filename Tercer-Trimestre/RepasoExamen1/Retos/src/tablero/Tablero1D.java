package tablero;

import ejercito.Ejercito;
import personajes.Personaje;

import java.util.ArrayList;
import java.util.Arrays;

public class Tablero1D {
    private String[] tablero;

    public Tablero1D() {
        tablero = new String[20];
        Arrays.fill(tablero, "    ");
    }

    public Tablero1D(Ejercito ejercito1, Ejercito ejercito2) {
        this();
        colocarPersonajes(ejercito1, ejercito2);
    }

    public void moverPersonaje(int pos, Personaje enemigo) {
        int posAnterior;
        if(pos >= 0 && pos <= tablero.length - 1) {
            if(tablero[pos].equals("    ")) {
                posAnterior = enemigo.getPosTablero();
                tablero[pos] = tablero[posAnterior];
                tablero[posAnterior] = "    ";
            }
        }
    }

    public void eliminarPersonaje(int pos) {
        tablero[pos] = "    ";
    }

    public void colocarPersonajes(Ejercito ejercito1, Ejercito ejercito2) {
        Personaje personaje;
        for(int i = 0; i < ejercito1.tamanyoEjercito(); i++) {
            personaje = ejercito1.obtenerPersonaje(i);
            tablero[personaje.getPosTablero()] = "E1" + personaje.getCODIGO();
        }
        for(int i = 0; i < ejercito2.tamanyoEjercito(); i++) {
            personaje = ejercito2.obtenerPersonaje(i);
            tablero[personaje.getPosTablero()] = "E2" + personaje.getCODIGO();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(tablero);
    }
}
