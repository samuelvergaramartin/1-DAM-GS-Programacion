import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            lista.add("Alumno " + i);
        }

        for(String alumno : lista) {
            System.out.println(alumno);
        }
    }
}