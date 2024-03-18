package examenglobaltrimestre2;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Personaje {
    private int vida;
    protected int codigo;
    
    protected Personaje(int vida, int codigo) {
        this.vida = vida;
        this.codigo = codigo;
    }
    
    protected void setVida(int vida) {
        this.vida = vida;
    }
    
    protected int getVida() {
        return vida;
    }
    
    @Override
    public String toString() {
        return "Codigo: "  + codigo + "\nNivel de vida: " + vida;
    }
}
