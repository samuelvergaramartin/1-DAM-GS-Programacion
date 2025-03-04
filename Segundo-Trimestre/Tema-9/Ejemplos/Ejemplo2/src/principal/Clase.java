package principal;

import interfaces.Interfaz;

public class Clase implements Interfaz {
    @Override
    public void metodoInterfaz() {
        System.out.println("Metodo de la interfaz");
    }

    @Override
    public void metodoOtraInterfaz() {
        System.out.println("Metodo de la otra interfaz.");
    }
}
