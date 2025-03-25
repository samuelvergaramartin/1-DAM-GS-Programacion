package principal;

import superclases.Jugador;

import java.util.Arrays;

public class Equipo {
    private String nombre, ciudad;
    private final Jugador[] JUGADORES;
    private Lista<Jugador> listaJugadores;

    public Equipo() {
        JUGADORES = new Jugador[21];
        listaJugadores = new Lista<>(new Jugador[0]);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void agregarJugador(Jugador jugador) {
        if(listaJugadores.tamanioLista() < 21) {
            listaJugadores.insertarAlFinal(jugador);
        }
    }

    @Override
    public String toString() {
        String resultado = "--" + getClass().getSimpleName() + "--\nNombre del equipo: " + nombre + "\nCiudad: " + ciudad + "\n";
        String listadoJugadores = listaJugadores.toString();

        resultado+= listadoJugadores;

        return resultado;
    }
}
