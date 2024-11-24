import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dias, horas, minutos, segundos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de dias: ");
        dias = sc.nextInt();
        segundos+= convertirASegundos(dias, "dias");

        System.out.print("Introduzca el numero de horas: ");
        horas = sc.nextInt();
        segundos+= convertirASegundos(horas, "horas");

        System.out.print("Introduzca el numero de minutos: ");
        minutos = sc.nextInt();
        segundos+= convertirASegundos(minutos, "minutos");

        System.out.println("El total de segundos es: " + segundos);
    }

    private static int convertirASegundos(int valor, String tipo) {
        int resultado;

        switch (tipo) {
            case "dias": {
                resultado = valor * 24 * 60 * 60;
                break;
            }
            case "horas": {
                resultado = valor * 60 * 60;
                break;
            }
            case "minutos": {
                resultado = valor * 60;
                break;
            }
            default: {
                resultado = 0;
                break;
            }


        }

        return resultado;
    }
}