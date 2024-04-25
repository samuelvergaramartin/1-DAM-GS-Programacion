import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array1[];
        int array2[];
        int volcado[];
        final String targetedFolder = "FicherosActividad10P13/";
        array1 = leerEnteros(targetedFolder, "enteros1.txt");
        array2 = leerEnteros(targetedFolder, "enteros2.txt");
        Arrays.sort(array1);
        Arrays.sort(array2);

        volcado = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, volcado, 0, volcado.length - array2.length);
        System.arraycopy(array2, 0, volcado, array1.length , volcado.length - array1.length);

        Arrays.sort(volcado);
        volcar(volcado, targetedFolder);
    }
    static int[] leerEnteros(String targetedFolder, String file) {
        int result[] = new int[0];
        Scanner sc = null;
        try (BufferedReader in = new BufferedReader(new FileReader(targetedFolder + file))){
            String line = in.readLine();
            while (line != null) {
                sc = new Scanner(line);
                if(sc.hasNextInt()) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = sc.nextInt();
                }
                line = in.readLine();
            }
        }
        catch(IOException exception) {
            System.out.println(exception);
        }
        return result;
    }
    static void volcar(int[] array, String targetedFolder) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(targetedFolder + "result.txt"))){
            for(int i = 0; i < array.length; i++) {
                out.write(array[i] + "\n");
            }
        }
        catch(IOException exception) {
            System.out.println(exception);
        }
    }
}