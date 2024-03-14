package ejercicio8p15aplicacion;
import java.util.Arrays;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.Colors.RED;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Lista {
    private Integer[] tabla;
    
    Lista() {
        this.tabla = new Integer[0];
    }
    
    int getTotalElementos() {
        return this.tabla.length;
    }
    
    void setNumberToEndList(Integer numero) {
        Integer resolve[] = new Integer[this.tabla.length + 1];
        System.arraycopy(this.tabla, 0, resolve, 0, resolve.length -1);
        this.tabla = null;
        this.tabla = new Integer[resolve.length];
        System.arraycopy(resolve, 0, this.tabla, 0, this.tabla.length - 1);
        resolve = null;
        this.tabla[tabla.length - 1] = numero;
    }
    
    void setNumberToStartList(Integer numero) {
        int oldLengthTable = this.tabla.length;
        Integer resolve[] = new Integer[this.tabla.length + 1];
        System.arraycopy(this.tabla, 0, resolve, 0, resolve.length -1);
        this.tabla = null;
        this.tabla = new Integer[resolve.length];
        System.arraycopy(resolve, 0, this.tabla, 0, this.tabla.length - 1);
        resolve = null;
        int lengthTable = this.tabla.length;
        Integer temp[] = new Integer[oldLengthTable];
        System.arraycopy(this.tabla, 0, temp, 0, temp.length);
        this.tabla = null;
        this.tabla = new Integer[lengthTable];
        System.arraycopy(temp, 0, this.tabla, 1, this.tabla.length - 1);
        this.tabla[0] = numero;
    }
    
    void insertNumberToListByIndex(Integer numero, int index) {
        this.tabla[index] = numero;
    }
    
    void insertOtherTableToEndList(Integer[] otherTable) {
        int position = this.tabla.length;
        Integer resolve[] = new Integer[this.tabla.length + otherTable.length];
        System.arraycopy(this.tabla, 0, resolve, 0, position);
        this.tabla = null;
        this.tabla = new Integer[resolve.length];
        System.arraycopy(resolve, 0, this.tabla, 0, this.tabla.length - 1);
        resolve = null;
        System.arraycopy(otherTable, 0, this.tabla, position, this.tabla.length - 2);
    }
    
    void deleteElementForTableByIndex(int index) {
        this.tabla[index] = null;
    }
    
    Integer getElementFromTableByIndex(int index) {
        return this.tabla[index];
    }
    
    void searchElementInTable(Integer element) {
        int position = -1;
        boolean control = false;
        for(int i = 0; i < this.tabla.length; i++) {
            if(this.tabla[i] == element && control == false) {
                control = true;
                position = i;
            }
        }
        if(position < 0) System.out.println(CYAN + -1);
        else System.out.println(CYAN + position);
    }
    
    boolean equals(Lista lista) {
        try {
            boolean iguales;
            iguales = Arrays.equals(this.tabla, lista.tabla);
            return iguales;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(RED + "Error: La longitud de ambos arrays son distintas entre si.");
            return false;
        }
    }
    
    @Override
    public String toString() {
        String result = CYAN + Arrays.toString(this.tabla);
        return result;
    }
}
