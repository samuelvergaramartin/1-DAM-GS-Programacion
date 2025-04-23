import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer num;

        do {
            num = leerEntero();
        }
        while (num == null);
    }

    private static Integer leerEntero() {
        Integer num;
        Scanner sc = new Scanner(System.in);

        try {
            num = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Formato inválido");
            num = null;
        }

        return num;
    }
}