public class Jugador implements Comparable<Jugador>{
    private static int numeroJugador = 0;
    private final int DORSAL;
    private final String DNI;
    private String nombre;
    private Posiciones posicion;
    private double estatura;

    public Jugador(String dni, String nombre, Posiciones posicion, double estatura) {
        this.DORSAL = ++numeroJugador;
        this.DNI = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public int getDORSAL() {
        return DORSAL;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tDorsal: " + DORSAL + "\n\tDNI: " + DNI + "\n\tNombre: " + nombre + "\n\tPosicion: " + posicion + "\n\tEstatura: " + estatura + "\n}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Jugador)) return false;

        return ((Jugador) obj).DNI.equals(this.DNI);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.DORSAL - o.DORSAL;
    }
}
