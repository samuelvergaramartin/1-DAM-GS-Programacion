import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tabla[] = {1,2,3,4,5,6,7,8,9,10};
        int table[] = new int[10];
        int laTabla[] = null;
        escrituraYLectura(tabla, table, laTabla);
    }

    private static void escrituraYLectura(int[] tabla, int[] table, int[] laTabla) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FicherosActividad11P1/datos.dat"))){
            for(int element : tabla) {
                out.writeInt(element);
            }
            out.writeObject(tabla);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("FicherosActividad11P1/datos.dat"))) {
            for(int element : table) {
                element = input.readInt();
                System.out.println(element);
            }
            laTabla = (int[]) input.readObject();
        }
        catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println(Arrays.toString(laTabla));
    }
}