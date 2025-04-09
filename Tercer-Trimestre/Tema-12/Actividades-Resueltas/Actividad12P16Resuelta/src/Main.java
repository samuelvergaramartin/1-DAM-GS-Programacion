import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Character, Academico> mapa = new TreeMap<>();

        nuevoAcademico(mapa, new Academico("Pedro", 2020), 'b');
        nuevoAcademico(mapa, new Academico("Alba", 2020), 'a');

        System.out.println(mapa);

    }

    private static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        boolean resultado;

        if(Character.isLetter(letra)) {
            if(academia.containsKey(letra)) {
                resultado = false;
            }
            else {
                academia.put(letra, nuevo);
                resultado = true;
            }
        }
        else resultado = false;

        return resultado;
    }
}