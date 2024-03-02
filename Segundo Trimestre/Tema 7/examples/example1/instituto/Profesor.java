package examples.example1.instituto;

public class Profesor {
    public String nombre;
    String dni;
    int tpc; //tiempo permanencia en el centro
    
    public Profesor(String nombre, String dni, int tpc) {
        this.nombre = nombre;
        this.dni = dni;
        this.tpc = tpc;
    }
}
