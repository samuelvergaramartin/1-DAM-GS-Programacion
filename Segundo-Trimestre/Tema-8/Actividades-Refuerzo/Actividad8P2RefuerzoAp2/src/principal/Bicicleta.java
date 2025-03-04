package principal;

import superclases.Vehiculo;

public class Bicicleta extends Vehiculo {
    public void andar() {
        kilometrosRecorridos++;
        kilometrosTotales++;
    }

    public void hacerCaballito() {
        kilometrosRecorridos+=10;
        kilometrosTotales+=10;
    }
}
