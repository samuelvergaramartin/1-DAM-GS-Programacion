public class MarcaPagina {
    private int numeroPagina = 1;
    private Integer ultimaPaginaLeida;

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String obtenerInformacionUltimaPaginaLeida() {
        String resultado;

        if(ultimaPaginaLeida == null) resultado = "No hay información registrada.";
        else resultado = "La última página leida es: " + ultimaPaginaLeida;

        return resultado;
    }

    public void incrementarPagina() {
        numeroPagina++;
        if(ultimaPaginaLeida != null) ultimaPaginaLeida++;
        else ultimaPaginaLeida = 1;
    }

    public void empezarNuevaLectura() {
        numeroPagina = 1;
        ultimaPaginaLeida = null;
    }
}
