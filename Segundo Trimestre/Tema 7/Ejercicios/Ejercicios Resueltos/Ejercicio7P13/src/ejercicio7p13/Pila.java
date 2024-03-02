package ejercicio7p13;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Pila {
    private Lista lista = new Lista();
    private Integer tempArray[];
    private Integer lecturaArray[];
    
    Pila() {};
    
    void apilarTodo(Integer[] array) {
        this.lecturaArray = null;
        this.tempArray = null;
        for(int i = 0; i < array.length; i++) {
            lista.setNumberToEndList(array[i]);
        }
    }
    
    Integer[] desapilarTodo() {
        int total = lista.getTotalElementos();
        tempArray = new Integer[total];
        for(int i = total - 1; i > 0; i--) {
            tempArray[i] = lista.getElementFromTableByIndex(i);
        }
        lista.resetTableFromRAM();
        return tempArray;
    }
    
    void apilar() {
        this.lecturaArray = new Integer[lista.getTotalElementos()];
        for(int i = 0; i < lista.getTotalElementos(); i++) {
            this.lecturaArray[i] = lista.getElementFromTableByIndex(i);
        }
        int startPosition = -1;
        int x = 0;
        while(startPosition == -1) {
            if(this.lecturaArray[x] == null) startPosition = x;
            else x++;
        }
        for(int i = this.tempArray.length - 1; i >= 0; i --) {
            lista.insertNumberToListByIndex(this.tempArray[i], startPosition);
            startPosition++;
        }
        this.lecturaArray = null;
        this.tempArray = null;
        
    }
    
    void desapilar(int toPosition) {
        int posiciones;
        this.lecturaArray = new Integer[lista.getTotalElementos()];
        for(int i = 0; i < lista.getTotalElementos(); i++) {
            this.lecturaArray[i] = lista.getElementFromTableByIndex(i);
        }
        int x = 0;
        posiciones = lista.getTotalElementos() - toPosition - 1;
        this.tempArray = new Integer[posiciones];
        for(int i = lista.getTotalElementos() - 1; i > toPosition; i--) {
            this.tempArray[x] = lista.getElementFromTableByIndex(i);
            lista.deleteElementForTableByIndex(i);
            x++;
        }
        this.lecturaArray = null;
    }
    
    Integer extraerYObtenerNumeroPorPosicion(int posicion) {
        this.desapilar(posicion);
        Integer resultado = lista.getElementFromTableByIndex(posicion);
        lista.deleteElementForTableByIndex(posicion);
        this.apilar();
        lista.decreaseLengthArrayIn1();
        lista.showAllElements();
        return resultado;
    }
}
