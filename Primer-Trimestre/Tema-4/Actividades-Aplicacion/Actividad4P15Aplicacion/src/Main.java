import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora1, minuto1, hora2, minuto2, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera hora: ");
        hora1 = sc.nextInt();

        System.out.print("Introduce el primer minuto: ");
        minuto1 = sc.nextInt();

        System.out.print("Introduce la segunda hora: ");
        hora2 = sc.nextInt();

        System.out.print("Introduce el segundo minuto: ");
        minuto2 = sc.nextInt();

        resultado = diferenciaMin(hora1, minuto1, hora2, minuto2);

        System.out.println("El resultado es: " + resultado);
    }

    private static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int diferenciaHoras, diferenciaMinutos;

        diferenciaHoras = Math.abs(hora1 - hora2);
        diferenciaMinutos = diferenciaHoras * 60;
        diferenciaMinutos+= Math.abs(minuto1 - minuto2);

        return diferenciaMinutos;

    }
}