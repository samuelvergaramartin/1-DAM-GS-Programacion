/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadPropuesta3P1 {
    public static void main(String[] args) {
        int edadMax = 0,edadMin = 0,edad = 0,control = 1;
        Scanner sc = new Scanner(System.in);

        while(edad != -1) {
            System.out.print("Introduce la edad del alumno numero " + control + ": ");
            edad = sc.nextInt();
            if(edad == -1) break;
            if(edadMin == 0) {
                edadMin = edad;
            }
            if(edad > edadMax) {
                edadMax = edad;
                System.out.println("Edad maxima del grupo de alumnos: " + edadMax);
                System.out.println("Edad minima del grupo de alumnos: " + edadMin);
                control++;
                continue;
            }
            if(edad < edadMin) {
                edadMin = edad;
                System.out.println("Edad maxima del grupo de alumnos: " + edadMax);
                System.out.println("Edad minima del grupo de alumnos: " + edadMin);
                control++;
                continue;
            }
            System.out.println("Edad maxima del grupo de alumnos: " + edadMax);
            System.out.println("Edad minima del grupo de alumnos: " + edadMin);
            control++;
        }
        sc.close();
        System.exit(0);
    }
}
