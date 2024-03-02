/**
 * @author Samuel Vergrara Martin
 */
import java.util.*;
public class ActividadPropuesta2P5 {
    public static void main(String[] args) {
        double aforoMaximo,precioPorEntrada,entradasVendidas;
        Boolean cancelado = false;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduzca el aforo maximo del local: ");
        aforoMaximo = sc.nextDouble();

        System.out.print("Introduzca el precio por entrada: ");
        precioPorEntrada = sc.nextDouble();
        
        System.out.print("Introduzca el numero de entradas vendidas: ");
        entradasVendidas = sc.nextDouble();
        
        if (entradasVendidas <= aforoMaximo/0.2){
            cancelado = true;
        }
        if (entradasVendidas <= aforoMaximo/0.5){
            precioPorEntrada *= 0.75;
        }
        if (cancelado){
            System.out.println("El concierto ha sido cancelado.");
        } else {
            System.out.println("El concierto se celebrará.\n Con un valor de "+ precioPorEntrada + " por entrada.");
        }

        sc.close();
        System.exit(0);
    }
}
/*
 int u = num %10;
 num /= 10;
 ìnt d = num %10
 num /= 10;
 int c = num %10;
 num /= 10;
 int un = num;

 if (u == um && d== c) {
    capicua = true;
 }
 else if(um == 0 && u == c) {
    capicua = true;
 }
 else if(um == 0 && c == 0 && d== u) {
    capicua = true
 }
 else if 
 */