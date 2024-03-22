package examenglobalsegundotrimestre;

/**
 *
 * @author Samuel Vergara Martín
 */
public abstract class Personaje {
    protected int codigo;
    private int nivelVida;
    
    protected Personaje(int codigo) {
        this.codigo = codigo;
    }
    
    protected void setVida(int vida) {
        nivelVida = vida;
    }
    
    protected int getVida() {
        return nivelVida;
    }
    
    @Override
    public String toString() {
        return "Nivel de vida: " + nivelVida + "\nCodigo: " + codigo;
    }
}
