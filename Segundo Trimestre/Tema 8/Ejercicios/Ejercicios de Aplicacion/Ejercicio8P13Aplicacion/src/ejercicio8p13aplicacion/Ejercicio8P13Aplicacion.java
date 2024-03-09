package ejercicio8p13aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P13Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double volumen, superficietotal;
        CajaCarton caja = new CajaCarton(20, 30, 50);
        volumen = caja.getVolumen();
        superficietotal = caja.getSuperficieTotal();
        System.out.println(volumen);
        System.out.println(superficietotal);
    }
    
}
