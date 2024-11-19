import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int anchura, altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        anchura = sc.nextInt();

        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        altura = sc.nextInt();

        if(altura < 2 || anchura < 2) System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        else {
            for(int i = 1; i <= altura; i++) {
                if(i == 1 || i == altura) {
                    for(int x = 1; x <= anchura; x++) {
                        System.out.print("* ");
                    }
                }
                else {
                    for(int x = 1; x <= anchura; x++) {
                        if(x == 1 || x == anchura) System.out.print("* ");
                        else System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }
    }
}