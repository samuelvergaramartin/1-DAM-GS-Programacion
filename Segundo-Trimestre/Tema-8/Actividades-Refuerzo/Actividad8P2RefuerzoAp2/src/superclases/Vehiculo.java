package superclases;

public class Vehiculo {
    public static int vehiculosCreados = 0;
    public static double kilometrosTotales = 0;
    protected double kilometrosRecorridos;

    public static double getKilometrosTotales() {
        return kilometrosTotales;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}
