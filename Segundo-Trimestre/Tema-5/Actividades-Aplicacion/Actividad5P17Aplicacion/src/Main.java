import static java.util.Arrays.copyOf;
public class Main {
    public static void main(String[] args) {
        int t[] = {10,1,5,8,9,2};

        t = suma(t, 3);

        System.out.println(java.util.Arrays.toString(t));
    }

    private static int[] suma(int t[], int numElementos) {
        int totalSuma, resultado[] = new int[0];

        for(int i = 0; i <= (t.length - numElementos); i++) {
            totalSuma = 0;
            for(int x = i; x < ((t.length - numElementos) + i); x++) {
                totalSuma+= t[x];
            }
            resultado = copyOf(resultado, resultado.length + 1);
            resultado[i] = totalSuma;
        }

        return resultado;
    }
}