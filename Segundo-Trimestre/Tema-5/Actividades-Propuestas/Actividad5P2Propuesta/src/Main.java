public class Main {
    public static void main(String[] args) {
        int tabla[] = new int[10], tabla2[];

        for(int i = 0; i < tabla.length; i++) {
            tabla[i] = i + 1;
        }

        tabla2 = tabla;

        for(int e : tabla2) {
            System.out.println(e);
        }
    }
}