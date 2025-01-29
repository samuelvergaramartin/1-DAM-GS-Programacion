import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int version;
        Scanner sc = new Scanner(System.in);
        String claveReal, clave;

        do {
            System.out.print("Seleccione una versión del juego (1 o 2): ");
            version = sc.nextInt();
            System.out.print("\r");
        }
        while (version != 1 && version != 2);

        System.out.print("Jugador 1, introduzca la contraseña: ");
        claveReal = sc.nextLine();

        System.out.print("\r");

        System.out.print("Jugador 2, adivine la contraseña: ");
        clave = sc.nextLine();

        while (!clave.equals(claveReal)) {
            if(version == 1) {
                
            }
        }
    }
}