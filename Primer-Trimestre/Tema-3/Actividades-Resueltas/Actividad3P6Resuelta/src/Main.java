import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

        while (num <= 0);

        for(int i = 1; i<= num; i++) {
            System.out.println(i);
        }
    }
}