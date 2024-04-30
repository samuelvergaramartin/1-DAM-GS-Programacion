import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosActividad11P8/";
        Socio socio1 = new Socio("1234567P", "Pepito");
        Socio socio2 = new Socio("7654321A", "Jorge");

        Socio socios[] = new Socio[2];
        socios[0] = socio1;
        socios[1] = socio2;
        Socio recuperada[] = null;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "socios.dat"))){
            out.writeObject(socios);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(directory + "socios.dat"))){
            recuperada = (Socio[]) input.readObject();
        }
        catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        //System.out.println(Arrays.deepToString(recuperada.toString()));
    }
}