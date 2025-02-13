public class SintonizadorFM {
    private double frecuencia;
    private final int FRECUENCIA_MINIMA = 80, FRECUENCIA_MAXIMA = 108;
    private final double VALOR_SALTO_FRECUENCIA = 0.5;

    public SintonizadorFM(double frecuencia) {
        if(frecuencia < FRECUENCIA_MINIMA || frecuencia > FRECUENCIA_MAXIMA) {
            this.frecuencia = FRECUENCIA_MINIMA;
        }
        else this.frecuencia = frecuencia;
    }

    public SintonizadorFM() {
        frecuencia = FRECUENCIA_MINIMA;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void subirFrecuencia() {
        final double valorFrecuencia = frecuencia;

        if(valorFrecuencia + VALOR_SALTO_FRECUENCIA > FRECUENCIA_MAXIMA) {
            frecuencia = FRECUENCIA_MINIMA + (VALOR_SALTO_FRECUENCIA - (FRECUENCIA_MAXIMA - valorFrecuencia));
        }
        else frecuencia+= VALOR_SALTO_FRECUENCIA;
    }

    public void bajarFrecuencia() {
        final double valorFrecuencia = frecuencia;

        if(valorFrecuencia - VALOR_SALTO_FRECUENCIA < FRECUENCIA_MINIMA) {
            frecuencia = FRECUENCIA_MAXIMA - (VALOR_SALTO_FRECUENCIA - (valorFrecuencia - FRECUENCIA_MINIMA));
        }
        else frecuencia-= VALOR_SALTO_FRECUENCIA;
    }

    @Override
    public String toString() {
        String resultado = getClass().getSimpleName() + " {\n";

        resultado+= "\tfrecuencia: " + frecuencia + "\n";
        resultado+= "}";

        return resultado;
    }
}
