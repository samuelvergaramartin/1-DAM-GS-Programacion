/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
import java.util.Scanner;
public class ActividadApp5P14 {
    public static void main(String[] args) {
        int inputValue = 0, sueldoMaximo, sueldoMinimo;
        double mediaSueldos;
        Scanner sc = new Scanner(System.in);
        int sueldos[] = new int[1];
        int sueldosDecreciente[];

        sueldos = recopilarSueldos(sueldos, sc, inputValue);
        sueldosDecreciente = new int[sueldos.length];
        sueldoMaximo = obtenerSueldoMaximo(sueldos);
        sueldoMinimo = obtenerSueldoMinimo(sueldos, sueldoMaximo);
        mediaSueldos = obtenerMediaSueldos(sueldos);
        sueldosDecreciente = obtenerSueldosDecreciente(sueldos);

        System.out.println("Sueldos de ordenados de forma decreciente: ");
        System.out.println(Arrays.toString(sueldosDecreciente));
        System.out.println("Sueldo maximo: " +  sueldoMaximo + "€ . Sueldo minimo: " + sueldoMinimo + "€");
        System.out.println("Media de los sueldos: " + mediaSueldos + "€");
    }
    static int[] recopilarSueldos(int[] sueldos, Scanner sc, int inputValue) {
        int c = 0;
        do {
            System.out.print("Introduce un sueldo: ");
            inputValue = sc.nextInt();
            
            sueldos[c] = inputValue;
            Arrays.copyOf(sueldos, sueldos.length + 1);
            
            c++;
        }
        while(inputValue != -1);
        sc.close();

        return sueldos;
    }
    static int obtenerSueldoMaximo(int[] sueldos) {
        int resultado = 0;

        for(int value : sueldos) {
            if(value > resultado) resultado = value;
        }
        
        return resultado;
    }
    static int obtenerSueldoMinimo(int[] sueldos, int sueldoMaximo) {
        int resultado = sueldoMaximo;
        for(int value : sueldos) {
            if(value < resultado) resultado = value;
        }

        return resultado;
    }
    static double obtenerMediaSueldos(int[] sueldos) {
        double media = 0;
        for(int value : sueldos) {
            media += value;
        }
        media /= sueldos.length;

        return media;
    }
    static int[] obtenerSueldosDecreciente(int[] sueldos) {
        int resultado[] = new int[sueldos.length];
        int copy[] = new int[sueldos.length];
        System.arraycopy(sueldos, 0, copy, 0, copy.length);
        Arrays.sort(copy);
        for(int i = copy.length -1; i >= 0; i--) {
            resultado[resultado.length - 1 - i] = copy[i];
        }

        return resultado;
    }
}
