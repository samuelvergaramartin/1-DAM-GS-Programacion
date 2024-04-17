import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner sc  = new Scanner(System.in);



        try {
            System.out.println("Introduce tu edad: ");
            edad = sc.nextInt();
            if(edad < 0) {
                throw new ExcepcionNegativa();
            }
            else {
                System.out.println(edad);
            }
        }
        catch (ExcepcionNegativa ex) {
            System.out.println(ex);
        }
    }
}