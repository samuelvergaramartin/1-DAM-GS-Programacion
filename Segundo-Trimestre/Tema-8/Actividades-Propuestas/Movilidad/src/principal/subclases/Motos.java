package principal.subclases;

import principal.superclases.Vehiculos;

public class Motos extends Vehiculos {

    private int cilindrada = 1;

    public Motos(String marca, String modelo, int cilindrada) {
        super(marca, modelo, Tipos.TERRESTRE);
        setCilindrada(cilindrada);
    }

    public void setCilindrada(int cilindrada) {
        if(cilindrada < 1) System.out.println("Error: La cilindrada debe ser mayor que 0");
        else this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cilindrada: " + cilindrada);
    }

    @Override
    public String toString() {
        String cad = super.toString().replace("Vehiculos ", getClass().getSimpleName() + " ");

        cad+= "\r\tCilindrada: " + cilindrada + "\n}";

        return cad;
    }
}
