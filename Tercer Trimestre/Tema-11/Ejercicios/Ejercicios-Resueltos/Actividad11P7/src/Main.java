import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosActividad11P7/";
        Scanner sc = new Scanner(System.in);

        escrituraYLectura(directory, sc);
    }

    private static void escrituraYLectura(String directory, Scanner sc) {
        int n;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "numeros.dat"))) {
            do {
                System.out.print("Introduce un numero: ");
                n = sc.nextInt();
                if (n != -1) {
                    out.writeInt(n);
                }
            }
            while (n != -1);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }


        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(directory + "numeros.dat"))){
            while(input.available() > 0) {
                System.out.println("Bloques: " + input.available());
                System.out.println(input.readInt());
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
    }
}