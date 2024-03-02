/**
 * @author SamuelVergara Martín
 */
import java.util.Scanner;
public class RefuerzoSwitch3Ap1 {
    public static void main(String[] args) {
        int num;
        Boolean par;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero del 1 al 10: ");
        num = sc.nextInt();

        if(num < 1 || num > 10) {
            System.out.println("ERROR: El numero introducido" + " debe ser entre el 1 y el 10");
            sc.close();
            System.exit(1);
        }

        par = num % 2 == 0;

        switch(par.toString()) {
            case "true": {
                System.out.println("El doble de " + num + " es " + num*2);
                sc.close();
                System.exit(0);
            }
            break;
            case "false": {
                System.out.println("El triple de " + num + " es " + num*3);
                sc.close();
                System.exit(0);
            }
            break;
            default: {
                sc.close();
                System.exit(1);
            }
            break;
        }
    }
}
