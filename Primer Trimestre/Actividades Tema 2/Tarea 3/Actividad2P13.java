/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad2P13 {
    public static void main(String[] args) {
        int hora,minutos,segundos;
        final int minSegundos = 0, minMinutos = 0, minHoras = 0,
        maxMinutos = 59,  maxSegundos = 59, maxHoras = 23;
        String hourResolver, minutesResolver, secondsResolver;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora: ");
        hora = sc.nextInt();
        
        System.out.print("Minuto: ");
        minutos = sc.nextInt();

        System.out.print("Segundo: ");
        segundos = sc.nextInt();

        if(hora < minHoras) {
            System.out.println("ERROR: El numero de horas no puede ser menor que 0");
            sc.close();
            System.exit(1);
        }
        if(minutos < minMinutos) {
            System.out.println("ERROR: El numero de minutos no puede ser menor que 0");
            sc.close();
            System.exit(1);
        }
        if(segundos < minSegundos) {
            System.out.println("ERROR: El numero de segundos no puede ser menor que 0");
            sc.close();
            System.exit(1);
        }
        if(hora > maxHoras) {
            System.out.println("ERROR: El numero de horas no puede ser mayor que 23");
            sc.close();
            System.exit(1);
        }
        if(minutos > maxMinutos) {
            System.out.println("ERROR: El numero de minutos no puede ser mayor que 60");
            sc.close();
            System.exit(1);
        }
        if(segundos > maxSegundos) {
            System.out.println("ERROR: El numero de segundos no puede ser mayor que 60");
            sc.close();
            System.exit(1);
        }

        if(segundos == maxSegundos) {
            segundos = 0;
            if(minutos == maxMinutos) {
                minutos = 0;
                if(hora == maxHoras) {
                    hora = 0;
                }
                else {
                    hora++;
                }
            }
            else {
                minutos++;
            }
        }
        else {
            segundos++;
        }

        if(hora < 10) {
            hourResolver = "0" + hora;
        }
        else {
            hourResolver = "" + hora;
        }
        if(minutos < 10) {
            minutesResolver = "0" + minutos;
        }
        else {
            minutesResolver = "" + minutos;
        }
        if(segundos < 10) {
            secondsResolver = "0" + segundos;
        }
        else {
            secondsResolver = ""  + segundos;
        }
        System.out.println("Hora actual [" + hourResolver + ":" + minutesResolver + ":" + secondsResolver + "]");
        sc.close();
        System.exit(0);
    }
}
