import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedWriter out = null;
        String cad = "En un lugar de la Mancha";

        try {
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            for(int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            out.newLine();
            cad = "de cuyo nombre no quiero acordarme";
            out.write(cad);
        }
        catch(IOException exception) {
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