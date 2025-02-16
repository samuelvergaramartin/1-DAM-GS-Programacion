import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Colores colores = new Colores();
        String paleta[], color;
        Scanner sc = new Scanner(System.in);

        System.out.println(colores);

        System.out.print("Introduce un color: ");
        color = sc.nextLine();

        colores.agregarColor(color);

        paleta = colores.obtenerPaleta(3);

        System.out.println(Arrays.toString(paleta));
    }
}