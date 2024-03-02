/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion4P14 {
    public static void main(String[] args) {
        int dias,horas,segundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de dias: ");
        dias = sc.nextInt();

        System.out.print("Introduce el numero de horas: ");
        horas = sc.nextInt();

        System.out.print("Introduce el numero de segundos: ");
        segundos = sc.nextInt();

        sc.close();

        int resultado = calcularSegundos(dias, horas, segundos);

        System.out.println(resultado + " segundos");
    }
    static int calcularSegundos(int dias, int horas, int segundos) {
        int resultado = (dias*24*60) + (horas*60) + segundos;
        return resultado;
    }
}
