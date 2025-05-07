package ejercito;

import personajes.Personaje;

import java.util.ArrayList;

public class Ejercito {
    private static int ejercitosCreados = 0;
    private final int NUMERO_EJERCITO;
    private final ArrayList<Personaje> EJERCITO;
    private int numIntegrantes;

    public Ejercito() {
        NUMERO_EJERCITO = ++ejercitosCreados;
        EJERCITO = new ArrayList<>();
        numIntegrantes = (int) ((Math.random() * 4) + 3); //Generamos el numero de integrantes que será entre 3 y 6
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



    @Override
    public String toString() {
        String resultado = "EJÉRCITO " + NUMERO_EJERCITO + "\nEJERCITO: " + numIntegrantes + " componentes\n";

        for (Personaje p : EJERCITO) {
            resultado += p.toString() + "\n";
        }

        return resultado;
    }
}
