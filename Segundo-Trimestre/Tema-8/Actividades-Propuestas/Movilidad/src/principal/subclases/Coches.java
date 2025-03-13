package principal.subclases;

import principal.superclases.Vehiculos;

public class Coches extends Vehiculos {

    private int numPuertas = 1, potencia;
    private String color;

    public Coches(String marca, String modelo, int numPuertas, int potencia, String color) {
        super(marca, modelo, Tipos.TERRESTRE);
        setNumPuertas(numPuertas);
        setPotencia(potencia);
        setColor(color);
    }

    public void setNumPuertas(int numPuertas) {
        if(numPuertas < 1) System.out.println("Error: El número de puertas debe ser mínimo 1");
        else this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setPotencia(int potencia) {
        if(potencia < 0) System.out.println("Error: La potencia debe ser un numero positivo");
        else this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de puertas: " + numPuertas + "\nPotencia: " + potencia + "\nColor: " + color);
    }

    @Override
    public String toString() {
        String cad = super.toString().replace("Vehiculos ", getClass().getSimpleName() + " ");

        cad+= "\r\tNúmero de puertas: " + numPuertas;
        cad+= "\n\tPotencia: " + potencia;
        cad+= "\n\tColor: " + color + "\n}";

        return cad;
    }
}
