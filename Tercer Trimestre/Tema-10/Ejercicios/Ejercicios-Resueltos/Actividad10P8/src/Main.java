import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line, fileName;
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = null;

        System.out.print("Introduzca el nombre del nuevo fichero: ");
        fileName = "copia_de_" + sc.nextLine();

        try (BufferedReader in = new BufferedReader(new FileReader("FicherosActividad10P8/file1.txt"))){
            out = new BufferedWriter(new FileWriter("FicherosActividad10P8/" + fileName));
            line = in.readLine();
            while(line != null) {
                out.write(line + "\n");
                line = in.readLine();
            }
        }
        catch (IOException exception) {
            System.out.println(exception);
        }
        finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}