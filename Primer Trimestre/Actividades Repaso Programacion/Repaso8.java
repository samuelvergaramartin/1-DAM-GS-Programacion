import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso8 {
    public static void main(String[] args) {
        int horas, resultado;
        final int salarioPorHora = 12, horasDeUnaSemana = 24 * 7;
        String msgResult;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el número de horas trabajadas en la semana: ");
        horas = sc.nextInt();

        resultado = horas * salarioPorHora;

        msgResult = horas <= 0 ? "ERROR: El número de horas tiene que ser mayor que 0" : (horas > horasDeUnaSemana ? "ERROR: El número de horas introducido es mayor al número de horas totales de una semana." : "Tu salario es de " + resultado + " euros");

        System.out.println(msgResult);

        sc.close();
    }
}
