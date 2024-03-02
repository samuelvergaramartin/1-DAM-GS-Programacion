/**
 * @author Samuel Vergara Martín
 */
public class ActividadRefuerzo6 {
    public static void main(String[] args) {
        int inicio = 320, Final = 160, retroceso = 20;
        do {
            System.out.println(inicio);
            inicio-=retroceso;
        }
        while(inicio != Final - retroceso);
    }
}
