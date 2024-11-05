import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, coeficiente, pos1, pos2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) System.out.print(1);
                else {
                    pos1 = i;
                    pos2 = j;
                }
            }
            System.out.println();
        }
    }
}