import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad;

        System.out.print("Introduce el texto: ");
        cad = sc.nextLine();

        System.out.println(cad.toLowerCase());
    }
}