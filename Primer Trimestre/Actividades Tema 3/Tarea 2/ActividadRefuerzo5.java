/**
 * @author Samuel Vergara Martín
 */
public class ActividadRefuerzo5 {
   public static void main(String[] args) {
        int inicio = 320, Final = 160, retroceso = 20;
        while(inicio != Final - retroceso) {
            System.out.println(inicio);
            inicio-=retroceso;
        }
   } 
}
