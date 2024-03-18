package examenglobaltrimestre2;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Jefe extends Personaje{
    private int vidaExtra;
    Jefe(int codigo) {
        super(20, codigo);
    }
    
    @Override
    public int getVida() {
        return super.getVida();
    }
    
    @Override
    public void setVida(int vida) {
        super.setVida(vida);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nVida extra: " + vidaExtra;
    }
    
    void setVidaExtra() {
        vidaExtra = codigo /2;
    }
}
