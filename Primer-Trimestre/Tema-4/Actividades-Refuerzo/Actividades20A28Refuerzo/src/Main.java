import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generaArrayInt(1,3,5)));
    }

    private static int[] generaArrayInt(int min, int max, int size) {
        int[] resultado = new int[size];

        for(int element : resultado) {
            element = (int) ((Math.random() * max) + min);
        }

        return resultado;
    }
}