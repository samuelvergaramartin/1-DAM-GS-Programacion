public class Main {
    public static void main(String[] args) {
        int tabla[] = {12,5,3,13,2,9,7};

        ordenacionPorBurbuja(tabla);

        System.out.println(java.util.Arrays.toString(tabla));
    }

    private static void ordenacionPorBurbuja(int t[]) {
        int aux;
        for(int i = t.length - 1; i >= 0; i--) {
            for (int x = 0; x < i; x++) {
                if(t[x] > t[x+1]) {
                    aux = t[x];
                    t[x] = t[x+1];
                    t[x+1] = aux;
                }
            }
        }
    }
}