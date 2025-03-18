public class Futbolista implements Comparable{
    private final String DNI;
    private int edad, numGoles;
    private String nombre;


    public Futbolista(String DNI, int edad, int numGoles, String nombre) {
        this.DNI = DNI;
        setEdad(edad);
        setNumGoles(numGoles);
        setNombre(nombre);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad >= 0) this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNumGoles(int numGoles) {
        if(numGoles >= 0) this.numGoles = numGoles;
    }

    public int getNumGoles() {
        return numGoles;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Futbolista)) return false;

        return ((Futbolista) obj).DNI.equals(DNI);
    }

    @Override
    public int compareTo(Object o) {
        return  ((Futbolista) o).DNI.compareTo(DNI);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tDNI: " +DNI + "\n\tEdad: " + edad + "\n\tNúmero de goles: " + numGoles + "\n\tNombre: " + nombre + "\n}";
    }
}
