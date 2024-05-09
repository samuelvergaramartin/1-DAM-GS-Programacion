import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer array[] = {1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,7,8,9,10}, sinRepeticiones[],
        arrayContainer[] = new Integer[0];
        Contenedor<Integer> contenedor = new Contenedor<>(arrayContainer);
        for(int i = 0; i < array.length; i++) contenedor.encolar(array[i]);
        sinRepeticiones = contenedor.eliminarRepeticiones(array);

        System.out.println(Arrays.toString(sinRepeticiones));
    }
}