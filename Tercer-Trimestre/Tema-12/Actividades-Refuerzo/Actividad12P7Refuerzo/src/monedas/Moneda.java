package monedas;

import tipos.TiposMoneda;

public class Moneda {
    TiposMoneda tipo;
    String posicion;

    public Moneda(TiposMoneda tipo) {
        this.tipo = tipo;
    }

    public TiposMoneda getTipo() {
        return tipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
