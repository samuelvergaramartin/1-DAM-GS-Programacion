import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        String cadena = "", input;

        do {
            System.out.print("Introduce una palabra: ");
            input = sc.next();
            if(!input.equals("fin")) cadena+= input;
        }
        while(!input.equals("fin"));

        try {
            out = new BufferedWriter(new FileWriter("ejerciciopropuesto10p4.txt"));
            for(int i = 0; i < cadena.length(); i++) {
                out.write(cadena.charAt(i));
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