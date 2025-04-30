import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        final String FICHERO = "Actividad10P12Aplicacion/datos.txt";
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        do {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
        }
        while (edad <= 0);

        try(BufferedWriter out = new BufferedWriter(new FileWriter(FICHERO, true))) {
            out.write(nombre + " - " + edad);
            out.newLine();
        }
        catch (IOException  ex) {
            System.out.println(ex);
        }
    }
}