package ejercicio7p9;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Bombilla {
    private boolean estadoGeneral;
    public boolean estadoBombilla;
    
    public Bombilla() {
        this.estadoGeneral = false;
        this.estadoBombilla = false;
    }
    
    public void encenderBombilla() {
        this.estadoBombilla = true;
    }
    
    public void apagarBombilla() {
        this.estadoBombilla = false;
    }
    
    public void updateEstadoGeneral(boolean estado) {
        this.estadoGeneral = estado;
    }
    
    public boolean estadoBombilla() {
        if(this.estadoGeneral == false) return false;
        else return this.estadoBombilla;
    }
}
