import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora tiempo = new Hora();

        System.out.print("Horas: ");
        tiempo.setHoras(sc.nextInt());

        System.out.print("Minutos: ");
        tiempo.setMinutos(sc.nextInt());

        System.out.print("Segundos: ");
        tiempo.setSegundos(sc.nextInt());
    }
}