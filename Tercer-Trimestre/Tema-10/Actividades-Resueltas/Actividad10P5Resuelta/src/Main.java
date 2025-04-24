import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in;
        Scanner sc;
        String linea;
        double suma = 0;

        try {
            in = new BufferedReader(new FileReader(""));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado.");
        }
    }
}