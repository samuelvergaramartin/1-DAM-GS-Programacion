public class FichaDomino {
    private int ladoIzquierdo, ladoDerecho;

    public FichaDomino(int ladoIzquierdo, int ladoDerecho) {
        if(estaEnRango(ladoIzquierdo)) this.ladoIzquierdo = ladoIzquierdo;
        if(estaEnRango(ladoDerecho)) this.ladoDerecho = ladoDerecho;
    }

    public String voltea() {
        int aux = ladoIzquierdo;
        ladoIzquierdo = ladoDerecho;
        ladoDerecho = aux;
        return toString();
    }

    public boolean encaja(FichaDomino otraFicha) {
        return (otraFicha.toString().contains(""+ladoIzquierdo) || otraFicha.toString().contains(""+ladoDerecho));
    }

    private boolean estaEnRango(int num) {
        return (0 <= num) && (num <= 6);
    }

    private String obtenerValor(int num) {
        return num == 0 ? " " : String.valueOf(num);
    }

    @Override
    public String toString() {
        return "[" + obtenerValor(ladoIzquierdo) + "|" + obtenerValor(ladoDerecho) + "]";
    }
}
