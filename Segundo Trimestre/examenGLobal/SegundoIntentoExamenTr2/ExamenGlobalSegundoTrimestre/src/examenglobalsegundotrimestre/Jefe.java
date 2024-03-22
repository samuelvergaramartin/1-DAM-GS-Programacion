package examenglobalsegundotrimestre;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Jefe extends Personaje {
    private int vidaExtra;
    
    Jefe(int codigo) {
        super(codigo);
        setVida(20);
        vidaExtra = codigo / 2;
    }
    
    int getVidaExtra() {
        return vidaExtra;
    }
    
    void setVidaExtra(int vidaExtra) {
        this.vidaExtra = vidaExtra;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nVida Extra: " + vidaExtra;
    }
}
