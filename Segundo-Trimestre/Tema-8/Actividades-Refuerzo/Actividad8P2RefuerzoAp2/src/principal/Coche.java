package principal;

import superclases.Vehiculo;

public class Coche extends Vehiculo {
    public void andar() {
        kilometrosRecorridos++;
        kilometrosTotales++;
    }

    public void quemarRueda() {
        kilometrosRecorridos+=10;
        kilometrosTotales+=10;
    }
}
