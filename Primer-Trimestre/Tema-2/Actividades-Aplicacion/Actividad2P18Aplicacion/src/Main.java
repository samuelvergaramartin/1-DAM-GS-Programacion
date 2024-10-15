import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2, result, correctResult = 0, op;
        char operador = 'ñ';
        Scanner sc = new Scanner(System.in);

        //Generamos 2 numeros aleatorio entre 1 y 99.
        num1 = (int) ((Math.random() * 98) + 1);
        num2 = (int) ((Math.random() * 98) + 1);

        //Ahora generamos aleatoriamente la operacion
        op = (int) ((Math.random() * 3) + 1);

        switch (op) {
            case 1: {
                operador = '+';
                correctResult = num1 + num2;
            }
            break;
            case 2: {
                operador = '-';
                correctResult = num1 - num2;
            }
            break;
            case 3: {
                operador = '*';
                correctResult = num1 * num2;
            }
            break;
            case 4: {
                operador = '/';
                correctResult = num1 / num2;
            }
            break;
        }

        System.out.print(num1 + " " + operador + " " + num2 + " = ");
        result = sc.nextInt();

        if((correctResult == result)) System.out.println("Correcto!");
        else System.out.println("MEEEC! Incorrecto!");
    }
}