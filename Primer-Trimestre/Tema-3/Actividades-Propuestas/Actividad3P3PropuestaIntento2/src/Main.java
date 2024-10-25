import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, resto, result = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un numero positivo: ");
            num = sc.nextInt();
        }
        while (num <= 0);


        while(num>0){
            resto = num%10;

            result*=10;
            result+=resto;

            num/= 10;
        }

        System.out.println(result);
    }
}