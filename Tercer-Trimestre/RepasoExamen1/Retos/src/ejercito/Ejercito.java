package ejercito;

import personajes.Guerrero;
import personajes.Mago;
import personajes.Personaje;

import java.util.ArrayList;

public class Ejercito {
    private static int ejercitosCreados = 0;
    private final int NUMERO_EJERCITO;
    private final ArrayList<Personaje> EJERCITO;

    public Ejercito() {
        int numIntegrantes = (int) ((Math.random() * 4) + 3); //Generamos el numero de integrantes que será entre 3 y 6;
        NUMERO_EJERCITO = ++ejercitosCreados;
        EJERCITO = new ArrayList<>();

        crearEjercito(numIntegrantes);
    }

    public int getNUMERO_EJERCITO() {
        return NUMERO_EJERCITO;
    }

    public int tamanyoEjercito() {
        return EJERCITO.size();
    }

    public void eliminarPersonaje(int pos) {
        EJERCITO.remove(pos);
    }

    public Personaje obtenerPersonaje(int i) {
        return EJERCITO.get(i);
    }

    public Personaje obtenerPersonajePorPosicionTablero(int posTablero) {
        Personaje personaje = null;
        int i = 0;

        while (i < EJERCITO.size() && personaje == null) {
            if(EJERCITO.get(i).getPosTablero() == posTablero) personaje = EJERCITO.get(i);
            i++;
        }

        return personaje;
    }

    public int obtenerIndicePersonaje(Personaje p) {
        return EJERCITO.indexOf(p);
    }

    public boolean ejercitoDerrotado() {
        boolean resultado = true;
        int i = 0;

        while (i < EJERCITO.size() && resultado) {
            if(EJERCITO.get(i).getVida() > 0) resultado = false;
            i++;
        }

        return resultado;
    }

    private void crearEjercito(int numIntegrantes) {
        int alea, pos;

        for(int i = 0; i < numIntegrantes; i++) {
            alea = (int) ((Math.random() * 2) + 1);
            pos = (int) ((Math.random() * 10));

            if(NUMERO_EJERCITO == 2) pos+= 10;

            while (posicionOcupada(pos)) {
                pos = (int) ((Math.random() * 10));
                if(NUMERO_EJERCITO == 2) pos+= 10;
            }

            if(alea == 1) EJERCITO.add(new Guerrero(pos));
            else EJERCITO.add(new Mago(pos));
        }
    }

    private boolean posicionOcupada(int pos) {
        boolean resultado = false;
        int i = 0;

        while (i < EJERCITO.size() && !resultado) {
            if(EJERCITO.get(i).getPosTablero() == pos) resultado = true;
            i++;
        }

        return resultado;
    }

    @Override
    public String toString() {
        String resultado = "EJÉRCITO " + NUMERO_EJERCITO + "\nEJERCITO: " + EJERCITO.size() + " componentes\n";

        for (Personaje p : EJERCITO) {
            resultado += p.toString() + "\n";
        }

        return resultado;
    }
}
