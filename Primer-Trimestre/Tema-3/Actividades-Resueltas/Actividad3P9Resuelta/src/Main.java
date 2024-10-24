import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }
        while (num < 1 || num > 10);

        for(int i = 0; i<= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}