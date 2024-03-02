/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P3 {
    public static void main(String[] args) {
        double radio,altura,modo,resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();

        System.out.print("Introduce el radio: ");
        radio = sc.nextDouble();

        System.out.print("Si desea calcular el area, introduzca 1.\nSi desea calcular el volumen, introduzca 2.\nSu opcion: ");
        modo = sc.nextDouble();

        sc.close();

        resultado = function(modo, radio, altura);

        System.out.printf("%.2",resultado);

        System.exit(0);
    }
    static double function(double modo, double radio, double altura) {
        double area,volumen,respuesta;
        area = 2 * Math.PI * (altura + radio);
        volumen = Math.PI * Math.pow(radio, 2) * altura;

        respuesta = modo == 1 ? area : (modo == 2 ? volumen : 0);

        return respuesta;
    }
}
