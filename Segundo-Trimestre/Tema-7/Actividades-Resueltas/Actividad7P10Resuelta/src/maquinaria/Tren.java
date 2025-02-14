package maquinaria;

import personal.Maquinista;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon vagones[] = new Vagon[0];
    private final int MAXIMO_VAGONES = 5;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void agregarVagon(int ID, double cargaMaxima) {
        Vagon vagon;

        if(vagones.length == 5) System.out.println("Error: No se pueden añadir más vagones.");
        else {
            vagon = new Vagon(ID, cargaMaxima);
            meterEnElArray(vagon);
        }
    }

    public void agregarVagon(int ID, double cargaMaxima, double cargaActual, String tipoMercancia) {
        Vagon vagon;

        if(vagones.length == 5) System.out.println("Error: No se pueden añadir más vagones.");
        else {
            vagon = new Vagon(ID, cargaMaxima, cargaActual, tipoMercancia);
            if(vagonExiste(vagon)) System.out.println("Error: El vagon ya existe.");
            else meterEnElArray(vagon);
        }
    }

    private void meterEnElArray(Vagon vagon) {
        vagones = Arrays.copyOf(vagones, vagones.length + 1);
        vagones[vagones.length - 1] = vagon;
    }

    private boolean vagonExiste(Vagon vagon) {
        boolean resultado = false;
        int i = 0;

        while (i < vagones.length && !resultado) {
            if(vagones[i].equals(vagon)) resultado = true;
        }

        return resultado;
    }
}
