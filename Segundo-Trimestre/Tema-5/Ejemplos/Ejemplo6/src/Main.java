import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tabla[] = {9,8,7,6,5,4,3,2,1};

        SeleccionSimplificada(tabla);

        System.out.println(Arrays.toString(tabla));
    }

    /*static void Seleccion(int tabla[], int NumeroElementos) {
        int indiceMenor, j, aux;
        for(int i = 0; i < NumeroElementos-1; i++) {
            indiceMenor = i;
            if(tabla[j] < tabla[indiceMenor]) {
                indiceMenor = j;
            }
            if(i != indiceMenor) {
                aux = tabla[i];
                tabla[i] = tabla[indiceMenor];
                tabla[indiceMenor] = aux;
            }
        }
    }*/

    //Corregir
    private static void SeleccionSimplificada(int tabla[]) {
        int menor, aux, pos = 0, temp;
        menor = tabla[0];

        for(int i = 0; i < tabla.length; i++) {
            for(int x = i; x < tabla.length; x++) {
                temp = menor;
                menor = Math.min(menor, tabla[x]);
                if(temp != menor) pos = x;
            }
            aux = tabla[i];
            tabla[i] = menor;
            tabla[pos] = aux;
        }
    }

    static void Insercion(int tabla[], int NumeroElementos) {
        int j, aux;
        for(int i = 1; i < NumeroElementos; i++) {
            j = i;
            aux = tabla[i];
            while (j > 0 && aux < tabla[j-i]) {
                tabla[j] = tabla[j-1];
                j--;
            }
            tabla[j] = aux;
        }
    }

    static void Burbuja(int tabla[],int NumeroElementos) {
        boolean ordenado = false;
        int pasada = 0, j, aux;

        while (pasada < NumeroElementos - 1 && !ordenado) {
            ordenado = true;
            for(j = 0; j < NumeroElementos - pasada - 1; j++) {
                if(tabla[j] > tabla[j+1]) {
                    ordenado = false;
                    aux = tabla[j];
                    tabla[j] = tabla[j+1];
                    tabla[j+1] = aux;
                }
            }
        }
    }
}