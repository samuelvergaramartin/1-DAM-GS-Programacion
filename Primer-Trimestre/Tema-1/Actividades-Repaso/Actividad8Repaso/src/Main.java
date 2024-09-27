import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horasTrabajadas, salarioSemanal;
        final int eurosPorHora = 12;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        salarioSemanal = (horasTrabajadas * eurosPorHora) * 5;

        System.out.println("El salario semanal es de " + salarioSemanal + " euros");
    }
}