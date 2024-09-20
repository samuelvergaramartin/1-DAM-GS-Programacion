import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean podemosSalir, lloviendo, tareasTerminadas, biblioteca;

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo?: ");
        lloviendo = sc.nextLine().toLowerCase().equals("si");

        System.out.print("¿Has terminado las tareas?: ");
        tareasTerminadas = sc.nextLine().toLowerCase().equals("si");

        System.out.print("¿Necesitas ir a la biblioteca?: ");
        biblioteca = sc.nextLine().toLowerCase().equals("si");

        podemosSalir = (!lloviendo && tareasTerminadas) || biblioteca;

        System.out.println(podemosSalir ? "Puedes salir" : "No puedes salir");
    }
}