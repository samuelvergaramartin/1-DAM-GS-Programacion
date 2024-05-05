import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosEjercicio11P3/";
        Scanner sc = new Scanner(System.in);
        int n, c = 0;
        double numero, tabla[], lectura[] = null;

        System.out.print("Introduce un numero entero: ");
        n = sc.nextInt();

        tabla = new double[n];

        do {
            System.out.print("Introduce un numero: ");
            numero = sc.nextDouble();
            tabla[c] = numero;
            c++;
        }
        while(c < n);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "file.samuel"))) {
            out.writeObject(tabla);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(directory + "file.samuel"))) {
            lectura = (double[]) input.readObject();
        }
        catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
        catch (IOException exception) {
            System.out.println(exception);
        }

        System.out.println(Arrays.toString(lectura));
    }
}