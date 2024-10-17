import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dia, asignatura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el dia de la semana: ");
        dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes": asignatura = "Lenguajes de Marcas";
            break;
            case "martes": asignatura = "Bases de Datos";
            break;
            case "miercoles": asignatura = "Bases de Datos";
            break;
            case "jueves": asignatura = "Bases de Datos";
            break;
            case "viernes": asignatura = "Programación";
            break;
            default: asignatura = "Ninguna";
            break;
        }

        System.out.println(asignatura);
    }
}