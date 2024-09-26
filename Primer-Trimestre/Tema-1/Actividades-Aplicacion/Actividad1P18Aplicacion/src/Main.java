import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nHormigas, nAranias, nCochinillas, result;
        final int patasHormigas = 6, patasAranias = 8, pataCochinillas = 14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de hormigas capturadas: ");
        nHormigas = sc.nextInt();

        System.out.print("Introduzca el numero de arañas capturadas: ");
        nAranias = sc.nextInt();

        System.out.print("Introduzca el numero de cochinillas capturadas: ");
        nCochinillas = sc.nextInt();

        result = (nHormigas * patasHormigas) + (nAranias * patasAranias) + (nCochinillas * pataCochinillas);

        System.out.println("El total de patas es: " + result);
    }
}