import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora tiempo = new Hora();
        int n;

        System.out.print("Horas: ");
        tiempo.setHoras(sc.nextInt());

        System.out.print("Minutos: ");
        tiempo.setMinutos(sc.nextInt());

        System.out.print("Segundos: ");
        tiempo.setSegundos(sc.nextInt());

        System.out.println("Hora introducida: " + tiempo.obtenerHoraCompleta());

        do {
            System.out.print("Introduce la cantidad de segundos a sumar: ");
            n = sc.nextInt();
        }
        while (n < 1);

        for(int i = 0; i < n; i++) {
            tiempo.incrementarUnSegundo();
            System.out.println(tiempo.obtenerHoraCompleta());
        }
    }
}