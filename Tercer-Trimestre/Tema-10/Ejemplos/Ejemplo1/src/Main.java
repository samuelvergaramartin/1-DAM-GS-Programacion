import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        try {
            if (edad < 0) {
                throw new ExcepcionEdadNegativa();
            }
        }
        catch (ExcepcionEdadNegativa e) {
            System.out.println(e);
        }


    }

    private static Integer division2(int a, int b) throws ArithmeticException {
        Integer res = a/b;

        return res;
    }

    private static Integer division(int a, int b) {
        Integer res;

        try {
            res = a / b;
            return res;
        }
        catch (ArithmeticException e) {
            res = null;
        }
        finally {
            System.out.println("Estoy en finally");
        }

        return res;
    }
}