import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        final int anchura = 6;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        altura = sc.nextInt();

        if(altura % 2 == 0 || altura < 5) System.out.println("La altura introducida no es correcta.");
        else {
            for(int i = 1; i <= altura; i++) {
                if(i == 1 || i == altura) {
                    for(int x = 1; x <= anchura; x++) {
                        System.out.print("M ");
                    }
                }
                else if(i == (altura/2)+1) {
                    for(int x = 1; x <= anchura; x++) {
                        System.out.print("M ");
                    }
                }
                else {
                    for(int x = 1; x <= anchura; x++) {
                        if(x == 1 || x == anchura) System.out.print("M ");
                        else System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }
    }
}