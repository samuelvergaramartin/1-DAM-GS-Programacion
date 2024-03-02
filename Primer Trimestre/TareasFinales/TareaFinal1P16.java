import java.util.Scanner;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P16 {
    public static void main(String[] args) {
        int seconds,minutes,hours;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca una cantidad en segundos: ");
        seconds = sc.nextInt();
        hours = seconds / 3600;
        seconds %= 3600;
        minutes = seconds / 60;
        seconds %= 60;

        System.out.println("Segundos: " + seconds + "\nMinutos: " + minutes + "\nHoras: " + hours);

        sc.close();
    }
}
