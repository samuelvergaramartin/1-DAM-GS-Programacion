import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosActividad10P12Aplicacion/";
        Scanner sc = new Scanner(System.in);
        String nombre, nombres[];
        int edad, edades[];

        System.out.print("Introduzca su nombre: ");
        nombre = sc.next();

        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();

        try (BufferedReader in = new BufferedReader(new FileReader(directory + "datos.txt"))){
            System.out.println("Existe el fichero");
        }
        catch(FileNotFoundException exception) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(directory + "datos.txt"))){
                System.out.println("[+] INFO: Se ha creado el fichero 'datos.txt'");
            }
            catch (IOException ex) {
                System.err.println("[X] ERROR: No se pudo crear el archivo datos.txt");
            }
        }
        catch(IOException exception) {
            System.err.println(exception);
        }
    }
    static String[] leerNombres(String directory, BufferedReader in) {
        String nombres[] = new String[0];
        
    }
}