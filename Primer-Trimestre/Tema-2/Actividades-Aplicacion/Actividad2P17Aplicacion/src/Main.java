import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2, result, correctResult;
        Scanner sc = new Scanner(System.in);

        //Generamos 2 numeros aleatorio entre 1 y 99.
        num1 = (int) ((Math.random() * 98) + 1);
        num2 = (int) ((Math.random() * 98) + 1);

        correctResult = num1 + num2;

        System.out.print(num1 + " + " + num2 + " = ");
        result = sc.nextInt();

        if((correctResult == result)) System.out.println("Correcto!");
        else System.out.println("MEEEC! Incorrecto!");
    }
}