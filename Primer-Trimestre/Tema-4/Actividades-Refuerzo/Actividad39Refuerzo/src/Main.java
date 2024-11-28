import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        String resultado;

        Funciones funciones = new Funciones();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        resultado = funciones.convierteEnPalabras(num);

        System.out.println(resultado);
    }


}