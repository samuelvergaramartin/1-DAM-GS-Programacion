/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class Actividad5P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int combinacion[],inputArray[];
        
        System.out.print("Introduzca la longitud de la combinacion secreta: ");
        longitud = sc.nextInt();

        combinacion = new int[longitud];
        combinacion = comboGenerator(combinacion);
        inputArray = new int[longitud];

        play(sc, 0, inputArray, combinacion);

        System.out.println("Felicidades! Has acertado la combinacion secreta!");

    }
    static int numberRandomGenerator() {
        int num;
        num = (int) (Math.random() * 5 + 1);
        
        return num;
    }
    static int[] comboGenerator(int array[]) {
        int numRandom;
        for(int i = 0; i < array.length; i++) {
            numRandom = numberRandomGenerator();
            array[i] = numRandom;
        }
        return array;
    }
    static void play(Scanner sc, int inputValue, int[] inputArray, int[] combinacion) {
        do {
            for(int i = 0; i < inputArray.length; i++) {
                inputArray[i] = 0;
            }
            System.out.println("Introduzca una combinacion:");
            for(int x = 0; x < inputArray.length; x++) {
                System.out.print("Introduzca un numero: ");
                inputValue = sc.nextInt();
                inputArray[x] = inputValue;
                if(inputValue < combinacion[x]) {
                    System.out.println("No, es mayor que el numero introducido.");
                }
                if(inputValue > combinacion[x]) {
                    System.out.println("No, es menor que el numero introducido.");
                }
            }
        }
        while(!Arrays.equals(inputArray, combinacion));
    }
}
