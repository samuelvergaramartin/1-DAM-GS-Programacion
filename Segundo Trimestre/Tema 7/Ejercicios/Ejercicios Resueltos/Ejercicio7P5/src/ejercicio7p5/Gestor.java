package ejercicio7p5;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Gestor {
    final private int default_importe_max = 10000;
    public String nombre;
    private int telefono = 0;
    int importe_max = default_importe_max;
    
    void setName(String nombre) {
        this.nombre = nombre;
    }
    void setTelefono(int telefono) {
        if(this.telefono != 0) throw new Error("ERROR: El numero del telefono del gestor no se puede modificar.");
        else this.telefono = telefono;
    }
    void setImporteMaximo(int importe_max) {
        if(importe_max > default_importe_max || importe_max < 0) throw new Error("ERROR: El importe maximo debe ser un numero positivo y menor o igual que 10000");
        else this.importe_max = importe_max;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public String getName() {
        return this.nombre;
    }
    int getImporteMaximo() {
        return this.importe_max;
    }
    Gestor() {};
}
