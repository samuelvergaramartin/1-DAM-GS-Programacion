package embarcaciones;

public abstract class Barco {
    private static int contadorBarcos = 0;
    final String CODIGO;
    double longitud;

    public Barco(String iniciales, double longitud) {
        CODIGO = iniciales + (++contadorBarcos);
        setLongitud(longitud);
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setLongitud(double longitud) {
        if(longitud > 0) this.longitud = longitud;
        else this.longitud = 1;
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
