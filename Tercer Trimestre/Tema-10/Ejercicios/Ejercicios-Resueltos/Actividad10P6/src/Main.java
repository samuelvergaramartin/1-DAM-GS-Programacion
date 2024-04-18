import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        int suma = 0, num, contador = 0;
        Scanner sc;

        try {
            in = new FileInputStream("Enteros.txt");
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        finally {
            sc = new Scanner(in);
            while(sc.hasNext()) {
                num = sc.nextInt();
                suma += num;
                contador++;
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/contador);
    }
}