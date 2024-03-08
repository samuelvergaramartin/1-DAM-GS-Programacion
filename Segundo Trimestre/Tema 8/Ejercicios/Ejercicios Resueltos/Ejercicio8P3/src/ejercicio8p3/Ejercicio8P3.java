package ejercicio8p3;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoraExacta hora1 = new HoraExacta(10,0,0);
        HoraExacta hora2 = new HoraExacta(10,0,0);
        boolean horasIguales;
        horasIguales = hora1.sonIguales(hora2);
        if(horasIguales) System.out.println("Son Iguales");
        else System.out.println("No son iguales");
        
    }
    
}
