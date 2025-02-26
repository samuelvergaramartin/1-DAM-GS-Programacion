package principal;

import enumerados.Unidad;
import superclases.Caja;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(10, 10,10, Unidad.CM);

        caja.setEtiqueta("Esto es una caja");

        System.out.println(caja);

        System.out.println(caja.getVolumen());
    }
}