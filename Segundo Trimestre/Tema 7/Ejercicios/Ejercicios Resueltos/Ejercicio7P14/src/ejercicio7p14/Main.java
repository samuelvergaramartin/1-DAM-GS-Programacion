package ejercicio7p14;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Main {
    private int tablaEnteros[];
    
    Main() {
        this.tablaEnteros = new int[10];
        for(int i = 0; i < tablaEnteros.length; i++) {
            this.tablaEnteros[i] = i+1;
        }
        System.out.println(CYAN + java.util.Arrays.toString(this.tablaEnteros));
    }
    
    void insertarFinal(int nuevo) {
        this.aumentarLengthTablaEn1();
        this.tablaEnteros[this.tablaEnteros.length -1] = nuevo;
        System.out.println(CYAN + java.util.Arrays.toString(this.tablaEnteros));
    }
    
    private void aumentarLengthTablaEn1() {
        int resolve[] = new int[this.tablaEnteros.length + 1];
        System.arraycopy(this.tablaEnteros, 0, resolve, 0, resolve.length -1);
        this.tablaEnteros = null;
        this.tablaEnteros = new int[resolve.length];
        System.arraycopy(resolve, 0, this.tablaEnteros, 0, this.tablaEnteros.length - 1);
        resolve = null;
    }
}
