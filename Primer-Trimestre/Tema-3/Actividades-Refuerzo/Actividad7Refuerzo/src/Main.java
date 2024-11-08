import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int numSecreto = 1234;
        int num, intentos = 4;
        boolean acertado = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce la combinación secreta: ");
            num = sc.nextInt();

            if(num != numSecreto) {
                System.out.println("Error: Esa no es la combinación.");
                intentos--;
            }
            else acertado = true;
        }
        while (intentos > 0 && !acertado);

        if(!acertado) System.out.println("Lo siento, no has logrado abrir la caja fuerte y te quedastes sin intentos");
        else System.out.println("Felicidades, has abierto la caja fuerte");
    }
}