import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos nuestras variables
        int num;
        String resultado = null;
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario un numero y lo guardamos
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        //Verificamos que el número sea entre 1 y 7
        if(num >= 1 && num <= 7) {
            //Ahora asignamos el valor del dia de la semana dependiendo del numero introducido
            switch (num) {
                case 1: resultado = "Lunes";
                break;
                case 2: resultado = "Martes";
                break;
                case 3: resultado = "Miércoles";
                break;
                case 4: resultado = "Jueves";
                break;
                case 5: resultado = "Viernes";
                break;
                case 6: resultado = "Sábado";
                break;
                case 7: resultado = "Domingo";
                break;
            }

            System.out.println(resultado);
        }
        else System.out.println("El número introducido no es válido, debe ser entre 1 y 7");
    }
}