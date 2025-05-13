package embarcaciones;

public abstract class Barco {
    private static int contadorBarcos = 0;
    final String CODIGO;
    int longitud;

    public Barco(String iniciales, int longitud) {
        CODIGO = iniciales + (++contadorBarcos);
        setLongitud(longitud);
    }

    public void setLongitud(int longitud) {
        if(longitud > 0) longitud = this.longitud;
        else longitud = 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Barco)) return false;

        return ((Barco) obj).longitud == longitud;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tCÓDIGO: " + CODIGO + "\n\tLONGITUD: " + longitud + "\n}";
    }
}
