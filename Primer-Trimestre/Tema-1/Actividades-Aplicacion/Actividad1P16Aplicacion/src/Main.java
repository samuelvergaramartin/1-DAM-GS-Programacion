import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horas, minutos, segundos, resto, resto1, resto2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de segundos: ");
        segundos = sc.nextInt();

        resto = segundos % 3600;
        resto1 = segundos % 3600;
        horas = segundos / 3600;
        segundos -= segundos / 3600;
        segundos+= resto;

        resto = segundos % 60;
        resto2 = segundos% 60;
        minutos = segundos / 60;
        segundos-= segundos / 60;
        segundos+= resto;

        segundos = (resto1 + resto2) -resto;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " +  segundos);
    }
}