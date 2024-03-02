/**
 * @author Samuel Vergara Martín
 * @see - 3 - Haz un programa que inicialice en el codigo un array que va contener la edad de 10 alumnos. 
 * Le tenemos que pedir al usuario que introduzca un alumno y le cambie la edad. Posteriormente, mostramos el array.
 */
import java.util.Scanner;
public class EjercicioDictado3 {
    public static void main(String[] args) {
        int edades[],index,newValue;
        edades = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<edades.length;i++) {
            edades[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("Edades de los alumnos: ");
        for(int i = 0;i<edades.length;i++) {
            System.out.print(edades[i] + " ");
        }
        System.out.println("");
        System.out.print("Introduce el indice de la edad a modificar: ");
        index = sc.nextInt();

        System.out.print("Introduzca el nuevo valor: ");
        newValue = sc.nextInt();

        sc.close();

        edades[index] = newValue;

        System.out.print("Edades de los alumnos: ");
        for(int i = 0;i<edades.length;i++) {
            System.out.print(edades[i] + " ");
        }
    }
}
