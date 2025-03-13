package principal.superclases;

public class Vehiculos {
    protected String marca, modelo;
    protected enum Tipos {
        TERRESTRE, ACUATICO, AEREO
    }
    private final Tipos tipo;

    public Vehiculos(String marca, String modelo, Tipos tipo) {
        setMarca(marca);
        setModelo(modelo);
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nTipo: " + tipo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tMarca: " + marca + "\n\tModelo: " + modelo + "\n\tTipo: " + tipo + "\n}";
    }
}
