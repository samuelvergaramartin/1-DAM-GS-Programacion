import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        String texto = "", linea;

        try  {
            in = new BufferedReader(new FileReader("/home/sam170703dev/Documentos/GitHub/1-DAM-GS-Informatica/1-DAM-GS-Programacion/Tercer Trimestre/Tema-10/Ejercicios/Ejercicios-Resueltos/Actividad10P1/src/Main.java"));

            linea = in.readLine();
            while(linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        System.out.println(texto);
    }
}