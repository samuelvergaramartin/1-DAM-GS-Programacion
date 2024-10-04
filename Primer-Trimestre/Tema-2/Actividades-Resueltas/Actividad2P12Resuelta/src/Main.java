import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos las variables
        int dia, mes, anio;
        boolean formatoCorrecto = false;
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario dia, mes y año y lo guardamos
        System.out.print("Introduzca el día: ");
        dia = sc.nextInt();

        System.out.print("Introduzca el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduzca el año: ");
        anio = sc.nextInt();

        //Comprobamos que el formato de la fecha sea el correcto
        if((dia > 0 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio > 0)) {
            formatoCorrecto = true;
            switch (mes) {
                case 4,6,9,11: if(dia == 31) formatoCorrecto = false;
                break;
                case 2: if (dia > 28) formatoCorrecto = false;
            }
        }

        //Mostramos al usuario el resultado final
        if(formatoCorrecto) System.out.println("La fecha introducida es correcta");
        else System.out.println("La fecha introducida es incorrecta");
    }
}