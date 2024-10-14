import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 1;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre el 1 y el 10: ");
        num = sc.nextInt();

        if(num >= 1 && num <= 10) {
            if(switchType == 1) {
                switch (num )
            }
            else {

            }
        }
        else System.out.println("Error: El número introducido no es válido.");
    }
}