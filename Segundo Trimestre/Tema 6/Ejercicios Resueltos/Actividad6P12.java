/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
import java.util.Arrays;
public class Actividad6P12 {
    public static void main(String[] args) {
        String palabra1,palabra2;
        Scanner sc = new Scanner(System.in);
        char p1[],p2[];

        System.out.print("Escribe una palabra: ");
        palabra1 = sc.nextLine();

        System.out.print("Escribe otra palabra: ");
        palabra2 = sc.nextLine();

        sc.close();

        if(palabra1.length() != palabra2.length()) System.out.println("No son anagramas");
        else {
            p1 = palabra1.toCharArray();
            p2 = palabra2.toCharArray();

            Arrays.sort(p1);
            Arrays.sort(p2);

            if(!Arrays.equals(p1, p2)) System.out.println("No son anagramas");
            else System.out.println("Son anagramas");
        }
    }
}
