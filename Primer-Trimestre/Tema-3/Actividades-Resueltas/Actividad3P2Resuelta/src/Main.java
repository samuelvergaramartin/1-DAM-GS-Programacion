import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad, sumaEdades = 0, numAlumnos = 0, mayoresDeEdad = 0;
        double mediaEdades = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la edad del alumno: ");
        edad = sc.nextInt();

        while (edad >= 0) {
            sumaEdades+= edad;
            numAlumnos++;
            if(edad >= 18) mayoresDeEdad++;
            mediaEdades = sumaEdades / numAlumnos;

            System.out.print("Introduzca la edad del alumno: ");
            edad = sc.nextInt();
        }

        System.out.println("Total de edades: " + sumaEdades);
        System.out.println("Total de alumnos: " + numAlumnos);
        System.out.println("Alumnos mayores de edad: " + mayoresDeEdad);
        System.out.println("Media de las edades: " + mediaEdades);
    }
}