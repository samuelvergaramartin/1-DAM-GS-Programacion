/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo20 {
    public static void main(String[] args) {
        int altura;
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        sc.nextLine();

        System.out.print("Introduce un caracter: ");
        c = sc.nextLine().charAt(0);

        for(int i = 1; i <= altura; i++) {  //Bucle que controla la fila
            
            for(int y = 1; y <=  altura - i; y++) {//Escribo los espacios antes del caracter
                System.out.print(" ");
            }
            for(int x = 1; x <= i; x++) {
                if(i > 2 && i < altura) {//Escribo caracter o hueco
                    if(x == 1 || x == i) {//Escribimos caracter en la primera y ultima posición
                        System.out.print(c + " ");
                    }
                    else {
                        System.out.print(" " + " ");//En medio escribo hueco + hueco
                    }
                }
                else {
                    System.out.print(c + " ");//En la ultima fila escribo todo caracteres
                }
            }
            System.out.println("");//Hago salto de linea
        }
        sc.close();
        System.exit(0);
    }
}
