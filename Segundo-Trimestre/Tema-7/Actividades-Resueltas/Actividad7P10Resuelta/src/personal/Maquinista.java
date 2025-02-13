package personal;

public class Maquinista {
    private String nombre;
    private final String DNI;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String DNI, double sueldo, String rango) {
        this(nombre, DNI);
        setSueldo(sueldo);
        this.rango = rango;
    }

    public Maquinista(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Maquinista(String nombre, String DNI, double sueldo) {
        this(nombre, DNI);
        setSueldo(sueldo);
    }

    public Maquinista(String nombre, String DNI, String rango) {
        this(nombre, DNI);
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo < 0) {
            System.out.println("Error: El sueldo tiene que ser mayor o igual que 0.");
        }
        this.sueldo = sueldo;
    }
}
