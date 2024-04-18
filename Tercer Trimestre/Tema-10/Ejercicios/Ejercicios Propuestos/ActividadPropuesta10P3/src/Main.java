import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileInputStream in = null;
        String texto = "", line = null;
        Scanner sc;

        try {
            in = new FileInputStream("Jugadores.txt");
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            do {
                if(in != null) {
                    sc = new Scanner(in);
                    line = sc.nextLine();
                    texto += line;
                }
            }
            while(line != null);
        }

        System.out.println(texto);
    }
}