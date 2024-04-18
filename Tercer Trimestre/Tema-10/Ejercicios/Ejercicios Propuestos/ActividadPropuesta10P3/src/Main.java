import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader buffer = null;
        Scanner sc;
        String nombres[] = new String[3], line, value;
        int edades[] = new int[3];
        double pesos[] = new double[3];

        try {
            buffer = new BufferedReader(new FileReader("Jugadores.txt"));
            line = buffer.readLine();
            while(line != null) {
                sc = new Scanner(line);
                while(sc.hasNext()) {
                    if(!sc.hasNextInt() && !sc.hasNextDouble()) {
                        for(int i = 0; i < nombres.length; i++) {
                            if(nombres[i] == null) {
                                nombres[i] = sc.next();
                                i = nombres.length;
                            }
                        }
                    }
                    if(sc.hasNextInt()) {
                        for(int i = 0; i < edades.length; i++) {
                            if(edades[i] == 0) {
                                edades[i] = sc.nextInt();
                                i = edades.length;
                            }
                        }
                    }
                    if(sc.hasNextDouble()) {
                        for(int i = 0; i < pesos.length; i++) {
                            if(pesos[i] == 0) {
                                pesos[i] = sc.nextDouble();
                                i = pesos.length;
                            }
                        }
                    }
                }
                line = buffer.readLine();
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
        finally {
            if(buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(pesos));
    }
}