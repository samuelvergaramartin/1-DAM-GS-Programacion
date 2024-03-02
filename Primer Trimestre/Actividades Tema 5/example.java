import java.util.*;
public class example {
    public static void main(String[] args) {
        /*int edad2[];
        edad2 = new int[10];

        edad2[0] = 10;

        for(int i = 0; i<edad2.length; i++) {
            edad2[i] = 2*i;
        }

        for(int i = 0; i<edad2.length; i++) {
            System.out.println(edad2[i]);
        }*/

        /*int n1 = 5, n2;
        int a[], b[];

        a = new int[5];

        b = a;

        System.out.println("a: " + a + "b: " + b);*/

        //Definir arrays

      /*   int a[];
        int []b;

        //Reservar memoria para el array 
        int c[] = {1,2,3}; //Asignoi memoria para tres elementos y doy valores.
        a = new int[5]; //Asigno memoria para 5 enteros.

        System.out.println("Primerm elemento de a: " + a[0]);
        //Para acceder a un elemento indico la posiciom
        // La primera posicion es la 0.
        System.out.println(a[0]);

        //Dar valores a todo el array
        //Calculo la longitud del array con length
        for(int i = 0; i<a.length; i++) {
            a[i] = i;
        }

        //Mostrar valores del array
        System.out.println("Muestro el array a");
        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("");
        //CUIDADO, cuando asigno una variable array a otra, no copio.
        // los contenidos, sino que le asigno la misma posicion de memoria.
        // Por lo tanto, todos los cambios que haga en un array se vam a 
        // reflejar en el otro array

        b = a;
        a[0] = 100;
        System.out.println(b[0]);*/

        /*int numeros[] = {11,2,43,14};
        int valor, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        valor = sc.nextInt();

        sc.close();

        i = 0;
        while (i<numeros.length && valor != numeros[i]) {
            i++;

        }

        if(i == numeros.length) {
            System.out.println("El elemento no se encuentra.");
        }
        else {
            System.out.println("El elemento está en la posición " + i);
        }*/

        /*int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int a[], b[];
        int c[] = new int[5];

        a = Arrays.copyOf(numeros, 5);

        System.out.println(Arrays.toString(a));

        b = Arrays.copyOfRange(numeros, 2, 6);

        System.out.println(Arrays.toString(b));

        System.arraycopy(numeros, 0, c, 0, 5);

        System.out.println(Arrays.toString(c));*/

        //Inicializo una matriz de dos filas y tres columnas
        /*  int matriz[][] = new int[2][3];

        //Para hallar la longitud en FILAS de una matriz, utilizo la propiedad length sobre la matriz (array bidimensional);

        //System.out.println(matriz[0].length);

        Scanner sc = new Scanner(System.in);

        for(int fila = 0; fila < matriz.length; fila++) {//Recorro ñas filas de la matriz
            for(int col = 0; col < matriz[fila].length; col++) {//Recorro las columnas de la matriz
                System.out.print("Introduce un valor: ");
                matriz[fila][col] = sc.nextInt();
            }
        }
        //Imprime una matriz de la clase Arreaus
        System.out.println(Arrays.deepToString(matriz));

        for(int fila = 0; fila < matriz.length; fila++) {
            for(int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println("");
        }

        for(int fila = 0; fila < matriz.length; fila++) {
            System.out.println(Arrays.toString(matriz[fila]));
        }

        //Imprimo la matriz con un for-each y Arrays

        for(int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        // Imprimo la matriz entera con un for-each 
        System.out.println("MATRIZ CON FOR-EACH");
        for(int fila[] : matriz) {
            for(int col : fila) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }*/

        /*int a[];

        for(int valor : a) {

        }

        int m[][];

        for(int fila[] : m) {
            for(int valor : fila) {

            }
        }

        int a3d[][][];

        for(int aux[][] : a3d) {
            for(int fila[] : aux) {
                for(int valor : fila) {
                    
                }
            }
        }*/
        
    }
}