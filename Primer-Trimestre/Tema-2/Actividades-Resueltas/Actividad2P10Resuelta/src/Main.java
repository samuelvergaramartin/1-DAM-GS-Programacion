import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos nuestras variables
        int nota;
        String resultado;
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario la nota y la guardamos
        System.out.print("Introduzca una nota: ");
        nota = sc.nextInt();

        //Evaluamos la nota , y creamos el resultado (insuficiente, suficiente, etc...)
        switch (nota) {
            case 0,1,2,3,4 : resultado = "Insuficiente";
            break;
            case 5: resultado = "Suficiente";
            break;
            case 6: resultado = "Bien";
            break;
            case 7,8: resultado = "Notable";
            break;
            case 9,10: resultado = "Sobresaliente";
            break;
            default: resultado = null;
            break;
        }
        //Comprobamos si la nota es válida, si no lo es se lo decimos al usuario
        //Si es válida, mostramos al usuario el resultado
        if(resultado == null) System.out.println("ERROR: La nota introducida no es válida, debe ser entre 0 y 10");
        else System.out.println(resultado);
    }
}