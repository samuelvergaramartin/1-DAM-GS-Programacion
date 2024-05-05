import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosEjercicio11P1/";
        int enteros[] = {1,2,3,4,5,6,7,8,9,10};
        int lectura[] = new int[enteros.length];
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "datos.dat"))) {
            for(int i = 0; i < enteros.length; i++) out.writeInt(enteros[i]);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(directory + "datos.dat"))) {
            for(int i = 0; i < enteros.length; i++) lectura[i] = input.readInt();
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        System.out.println(Arrays.toString(lectura));
    }
}