package personajes;

public abstract class Personaje {
    private static int numPersonajesCreados = 0;
    protected final String CODIGO;
    protected int vida, posTablero, alcanceAtaque, fuerzaAtaque, rangoMovimiento;

    public Personaje(String letra, int vida, int posTablero, int alcanceAtaque, int fuerzaAtaque, int rangoMovimiento) {
        CODIGO = letra + (++numPersonajesCreados);
        setVida(vida);
        setPosTablero(posTablero);
        setAlcanceAtaque(alcanceAtaque);
        setFuerzaAtaque(fuerzaAtaque);
        setRangoMovimiento(rangoMovimiento);
    }

    public void setVida(int vida) {
        this.vida = establecerValorPositivo(vida);
    }

    public void setPosTablero(int posTablero) {
        if(posTablero < 1 || posTablero > 20) this.posTablero = 1;
        else this.posTablero = posTablero;
    }

    public void setAlcanceAtaque(int alcanceAtaque) {
        this.alcanceAtaque = establecerValorPositivo(alcanceAtaque);
    }

    public void setFuerzaAtaque(int fuerzaAtaque) {
        this.fuerzaAtaque = establecerValorPositivo(fuerzaAtaque);
    }

    public void setRangoMovimiento(int rangoMovimiento) {
        this.rangoMovimiento = establecerValorPositivo(rangoMovimiento);
    }

    public abstract int atacar();

    public void recibirAtaque(int puntos) {
        if(puntos > 0) setVida(vida - puntos);
    }

    public int getVida() {
        return vida;
    }

    public int getPosTablero() {
        return posTablero;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    private int establecerValorPositivo(int valor) {
        int resultado = 0;

        if(valor >= 0) resultado = valor;

        return resultado;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tCódigo: " + CODIGO + "\n\tVida: " + vida + "\n\tPosición: " + posTablero + "\n\t Alcance Ataque: " + alcanceAtaque + "\n\tFuerza ataque: " + fuerzaAtaque + "\n\tRango Movimiento: " + rangoMovimiento + "\n}";
    }
}
