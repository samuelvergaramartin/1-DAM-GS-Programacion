import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definir un array de entero y reservar memoria para 10 elementos
        int array[] = new int[10];
        //Definir un array con los valores del 1 al 10
        int array2[] = {1,2,3,4,5,6,7,8,9,10};
        //Rellenar el primer array leyendo de teclado los valores
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce un valor: ");
            array[i] = sc.nextInt();
        }
        //Usando for-each, mostrar los valores del primer array
        System.out.println("Primer array");
        for(int e : array) {
            System.out.println(e);
        }
        System.out.println("-------------");
        //Cambiar los valores pares del segundo array por el valor 0
        for(int i = 0; i < array2.length; i++) {
            if(array2[i] % 2 == 0) array2[i] = 0;
        }
        //Mostrar el segundo array
        System.out.println("Segundo array");
        for(int e : array2) {
            System.out.println(e);
        }
    }
}