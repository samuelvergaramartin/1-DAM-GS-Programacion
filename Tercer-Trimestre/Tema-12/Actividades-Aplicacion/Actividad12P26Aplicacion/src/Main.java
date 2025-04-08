import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numGrupos;

        System.out.print("Introduce el nombre del alumno: ");
        nombre = sc.nextLine();

        while (!nombre.equals("fin")) {
            alumnos.add(nombre);
            System.out.print("Introduce el nombre del alumno: ");
            nombre = sc.nextLine();
        }

        do {
            System.out.print("Introduzca el número de grupos: ");
            numGrupos = sc.nextInt();
        }
        while (numGrupos <= 0);

        System.out.println(repartoAlumnos(alumnos, numGrupos));
    }

    private static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        int totalAlumnos = lista.size(), indice = 0, maxPorGrupo, resto;
        List<List<String>> resultado = null;
        List<String> listadoDelGrupo = new ArrayList<>();

        if(totalAlumnos >= numGrupos) {
            resultado = new ArrayList<>();

            maxPorGrupo = totalAlumnos/numGrupos;
            resto = totalAlumnos%numGrupos;
            for(int i = 0; i < numGrupos; i++) {
                listadoDelGrupo = new ArrayList<>();
                for(int x = 0; x < maxPorGrupo; x++, indice++) {
                    listadoDelGrupo.add(lista.get(indice));
                }
                resultado.add(listadoDelGrupo);
            }

            if(resto>0) {
                for(int i = 0; i < resto; i++, indice++) {
                    listadoDelGrupo.add(lista.get(indice));
                }
            }
        }

        return resultado;
    }
}