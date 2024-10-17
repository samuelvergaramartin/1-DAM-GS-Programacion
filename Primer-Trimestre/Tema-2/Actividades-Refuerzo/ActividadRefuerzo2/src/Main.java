import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una hora: ");
        hora = sc.nextInt();

        switch (hora) {
            case 6,7,8,9,10,11,12: result = "Buenos días!";
            break;
            case 13,14,15,16,17,18,19,20: result = "Buenas tardes!";
            break;
            case 21,22,23,0,1,2,3,4,5: result = "Buenas noches!";
            break;
            default: result = "Error: Hora inválida";
            break;
        }

        System.out.println(result);
    }
}