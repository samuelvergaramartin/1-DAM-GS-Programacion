import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numRandom1,numRandom2, num, resultSuma, operacionesCorrectas = -1;
        Scanner sc = new Scanner(System.in);

        do {
            operacionesCorrectas++;
            numRandom1 = (int) ((Math.random()* 100) + 1);
            numRandom2 = (int) ((Math.random()* 100) + 1);
            resultSuma = numRandom1 + numRandom2;

            System.out.print(numRandom1 + " + " + numRandom2 + " = ");
            num = sc.nextInt();

        }
        while ((num == resultSuma));

        System.out.println("El juego ha terminado. Número de operaciones correctas: " + operacionesCorrectas);
    }
}