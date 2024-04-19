import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        int suma = 0, num, contador = 0;
        Scanner sc;

        try {
            in = new BufferedReader(new FileReader("Enteros.txt"));
            sc = new Scanner(in);
            while(sc.hasNextInt()) {
                num = sc.nextInt();
                suma += num;
                contador++;
            }
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/contador);
    }
}