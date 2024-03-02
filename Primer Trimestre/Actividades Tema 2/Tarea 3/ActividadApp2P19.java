/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P19 {
    public static void main(String[] args) {
        final double convertir = Math.PI / 180;
        int grados;
        double radianes;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduzca los grados: ");
        grados = sc.nextInt();
        
        grados = grados % 360;
        radianes = grados * convertir;
        
        System.out.printf("En %d grados hay %f radianes", grados, radianes);

        sc.close();
        System.exit(0);
    }
}
