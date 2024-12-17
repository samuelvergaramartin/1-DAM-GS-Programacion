public class Main {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,4,5,6};

        System.out.println(buscar(numeros, 5));
    }

    private static int buscar(int t[], int clave) {
        int resultado = -1, i = 0;
        boolean encontrado = false;

        while (i < t.length && !encontrado) {
            if(t[i] == clave) {
                resultado = i;
                encontrado = true;
            }

            i++;
        }

        return resultado;
    }
}