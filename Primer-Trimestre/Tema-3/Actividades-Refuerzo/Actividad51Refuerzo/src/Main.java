import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        String n = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número entero (mayor que 0): ");
            num = sc.nextInt();
        }
        while (num <=0);

        n = num + "";
        n = n.replace('8',' ').replace('0', ' ').trim();
        System.out.println(n);
    }
}