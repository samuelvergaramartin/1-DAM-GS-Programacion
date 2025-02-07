public class Gestor {
    public String nombre;
    public final String telefono;
    double importeMaximo;


    Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        if(importeMaximo < 0) this.importeMaximo = 0;
        else this.importeMaximo = importeMaximo;
    }

    Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        importeMaximo = 10000;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }
}
