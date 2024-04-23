import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        String input;

        try {
            out = new BufferedWriter(new FileWriter("ejerciciopropuesto10p4.txt"));
            do {
                System.out.print("Introduzca una frase: ");
                input = sc.nextLine();
                if(!input.equals("fin")) {
                    out.write(input);
                    out.newLine();
                }
            }
            while(!input.equals("fin"));
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