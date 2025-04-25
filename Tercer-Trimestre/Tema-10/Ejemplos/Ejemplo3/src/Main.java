import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String linea;
        int num, res = 0;
        Scanner sc;

        try {
            in = new BufferedReader(new FileReader("Ejemplo3/numeros.txt"));

            linea = in.readLine();
            while (linea != null) {
                sc = new Scanner(linea);
                if(sc.hasNextInt()) {
                    num = sc.nextInt();
                    System.out.println(num);
                    res += num;
                }

                linea = in.readLine();
            }
            System.out.println(res);
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}