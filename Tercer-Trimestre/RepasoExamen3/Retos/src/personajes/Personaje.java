package personajes;

public abstract class Personaje {
    private static int numPersonajesCreados = 0;
    final String CODIGO;
    private int vida;
    int posTablero, alcanceAtaque, fuerzaAtaque, rangoMovimiento, posTableroX, posTableroY;

    @Deprecated
    public Personaje(String letra, int vida, int posTablero, int alcanceAtaque, int fuerzaAtaque, int rangoMovimiento) {
        CODIGO = letra + (++numPersonajesCreados);
        setVida(vida);
        setPosTablero(posTablero);
        setAlcanceAtaque(alcanceAtaque);
        setFuerzaAtaque(fuerzaAtaque);
        setRangoMovimiento(rangoMovimiento);
    }

    public Personaje(String letra, int vida, int posTableroX, int posTableroY, int alcanceAtaque, int fuerzaAtaque, int rangoMovimiento) {
        CODIGO = letra + (++numPersonajesCreados);
        setVida(vida);
        setPosTableroX(posTableroX);
        setPosTableroY(posTableroY);
        setAlcanceAtaque(alcanceAtaque);
        setFuerzaAtaque(fuerzaAtaque);
        setRangoMovimiento(rangoMovimiento);
    }

    public void setVida(int vida) {
        this.vida = establecerValorPositivo(vida);
    }

    @Deprecated
    public void setPosTablero(int posTablero) {
        if(posTablero < 1 || posTablero > 20) this.posTablero = 1;
        else this.posTablero = posTablero;
    }

    public void setPosTableroX(int posTableroX) {
        if(posTableroX >= 0) this.posTableroX = posTableroX;
    }

    public void setPosTableroY(int posTableroY) {
        if(posTableroY >= 0) this.posTableroY = posTableroY;
    }

    public int getPosTableroX() {
        return posTableroX;
    }

    public int getPosTableroY() {
        return posTableroY;
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

    @Deprecated
    public int getPosTablero() {
        return posTablero;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public int getRangoMovimiento() {
        return rangoMovimiento;
    }

    public int getAlcanceAtaque() {
        return alcanceAtaque;
    }

    private int establecerValorPositivo(int valor) {
        int resultado = 0;

        if(valor >= 0) resultado = valor;

        return resultado;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tCódigo: " + CODIGO + "\n\tVida: " + vida + "\n\tPosición: " + posTablero + "\n\tPosición X: " + posTableroX + "\n\tPosición Y: " + posTableroY + "\n\tAlcance Ataque: " + alcanceAtaque + "\n\tFuerza ataque: " + fuerzaAtaque + "\n\tRango Movimiento: " + rangoMovimiento + "\n}";
    }
}
