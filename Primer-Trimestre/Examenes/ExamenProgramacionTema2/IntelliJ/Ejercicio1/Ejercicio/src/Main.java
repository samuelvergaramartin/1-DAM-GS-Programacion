import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mediaCurso, notaProgramacion;
        int modulosSuspensos;
        String resultado;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce la nota media del curso: ");
        mediaCurso = sc.nextDouble();

        System.out.print("Introduce la nota de programación: ");
        notaProgramacion = sc.nextDouble();

        System.out.print("Introduce el número de módulos suspensos: ");
        modulosSuspensos = sc.nextInt();

        resultado = ((mediaCurso >= 7) || modulosSuspensos == 0) && notaProgramacion >= 8 ? "Puede entrar en el programa dual" : "No puede entrar en el programa dual";

        System.out.println(resultado);
    }
}