import java.util.Scanner;
import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) {
        int version;
        Scanner sc = new Scanner(System.in);
        String claveReal, clave;
        char claveRealArray[], claveArray[], pista[];

        do {
            System.out.print("Seleccione una versión del juego (1 o 2): ");
            version = sc.nextInt();
            System.out.print("\r");
        }
        while (version != 1 && version != 2);

        sc = new Scanner(System.in);

        System.out.print("Jugador 1, introduzca la contraseña: ");
        claveReal = sc.nextLine();

        claveRealArray = claveReal.toCharArray();

        System.out.print("Jugador 2, adivine la contraseña: ");
        clave = sc.nextLine();

        claveArray = clave.toCharArray();

        while (!clave.equals(claveReal)) {
            if(version == 1) {
                if(clave.length() > claveReal.length()) System.out.println("La clave introducida es mayor que la contraseña.");
                else System.out.println("La clave introducida es menor que la contraseña.");
            }
            else {
                pista = new char[claveRealArray.length];
                fill(pista, '-');
                for(int i = 0, x = 0; i < claveArray.length && x < claveRealArray.length; x++, i++) {
                    if (claveArray[i] == claveRealArray[x]) pista[x] = claveArray[i];
                }
                System.out.println(String.copyValueOf(pista));
            }

            System.out.print("Jugador 2, adivine la contraseña: ");
            clave = sc.nextLine();

            claveArray = clave.toCharArray();
        }

        System.out.println("Correcto, has adivinado la contraseña!");
    }
}