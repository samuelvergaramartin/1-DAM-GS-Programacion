/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P2 {
    public static void main(String[] args) {
        int edad = 0,suma = 0, media = 0, control = 0, mayor = 0;
        Scanner sc = new Scanner(System.in);

        while(edad >= 0) {
            if(edad == 0) {
                System.out.print("Introduce la edad del alumno numero 1: ");
                edad = sc.nextInt();
                control++;
                suma = edad + suma;
                media = suma / control;
                if(edad >= 18) {
                    mayor++;
                }
                while(edad > 0) {
                    System.out.print("Introduce la edad del alumno numero " + (control - 1) + ": ");
                    edad = sc.nextInt();
                    control++;
                    suma = edad + suma;
                    media = suma / control;
                    if(edad >= 18) {
                    mayor++;
                }
                    if(edad == 0) {
                        System.out.println("\nSuma de todas las edades de los alumnos: " + suma);
                        System.out.println("Media de las edades de los alumnos: " + media);
                        System.out.println("Numero total de alumnos: " + control);
                        System.out.println("Numero de alumnos que son mayores de edad: " + mayor);
                        break;
                    }
                }
                break;
            }
        }
        sc.close();
        System.exit(0);
    }
}
