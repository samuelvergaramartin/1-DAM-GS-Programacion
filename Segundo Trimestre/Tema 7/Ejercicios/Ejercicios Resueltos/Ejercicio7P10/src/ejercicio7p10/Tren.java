package ejercicio7p10;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Tren {
    Locomotora locomotora;
    /**
     * @Vagon[] vagones - Declaremos un array de 5 vagones, ya que, cada tren, como máximo
     * puede tener 5 vagones.
     */
    Vagon[] vagones = new Vagon[5];
    Maquinista maquinista;
    
    public Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }
}
