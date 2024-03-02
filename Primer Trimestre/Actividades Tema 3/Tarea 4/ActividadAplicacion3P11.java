/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P11 {
    public static void main(String[] args) {
        int num, temp, resTemp, digitos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        temp = num;

       for(int i = 1; true; i++) {
            resTemp = temp % 10;
            temp = temp / 10;
            if(resTemp == 0) {
                digitos = i;
                break;
            } 
       }

       for(int i = num; i != 1; i /= 2) {
            System.out.println(i%2);
       }
       sc.close();
       System.exit(0);
    }
}
