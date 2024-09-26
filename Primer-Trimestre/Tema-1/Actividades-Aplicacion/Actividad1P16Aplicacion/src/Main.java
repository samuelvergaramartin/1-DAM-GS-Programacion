import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de segundos: ");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        minutos = segundos / 60;
        segundos %= 60;
        minutos %=  60;

        //temp = segundos / 60;
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}