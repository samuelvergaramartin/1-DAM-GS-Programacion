package actividad9p1;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad9P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lista;
        Lista miLista = new Lista();
        miLista.Encolar(5);
        lista = miLista.toString();
        System.out.println(lista);
        miLista.Encolar(17);
        lista = miLista.toString();
        System.out.println(lista);
        miLista.Desencolar();
        lista = miLista.toString();
        System.out.println(lista);
        miLista.Desencolar();
        lista = miLista.toString();
        System.out.println(lista);
    }
    
}
