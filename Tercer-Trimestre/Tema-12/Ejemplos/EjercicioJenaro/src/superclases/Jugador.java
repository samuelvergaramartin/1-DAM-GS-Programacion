package superclases;

import enums.Posiciones;

public class Jugador {
    private String nombre;
    private static int numJugadoresCreados;
    private final int DORSAL;
    private Posiciones posicion;

    public Jugador(String nombre, Posiciones posicion) {
        this(nombre);
        this.posicion = posicion;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        DORSAL = ++numJugadoresCreados;
    }

    public int getDORSAL() {
        return DORSAL;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tNombre: " + nombre + "\n\tDorsal: " + DORSAL + "\n\tPosición: " + posicion + "\n}";
    }
}
