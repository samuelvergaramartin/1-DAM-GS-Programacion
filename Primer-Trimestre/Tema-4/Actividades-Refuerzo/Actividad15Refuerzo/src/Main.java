public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++) {
            if(esPrimo(i)) System.out.println(i);
        }
    }

    private static boolean esPrimo(int num) {
        int contador = 0;

        for(int i = num; i > 0; i--) {
            if(num % i == 0) contador++;
        }

        if(contador > 2) return false;
        else return true;
    }
}