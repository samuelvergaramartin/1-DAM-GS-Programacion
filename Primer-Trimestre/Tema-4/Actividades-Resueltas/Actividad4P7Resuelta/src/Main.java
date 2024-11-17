public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static boolean esPrimo(int num) {
        int contador = 0;
        boolean resultado = false;


        for(int j = 1; j <= num; j++) {
            if(num%j == 0) contador++;
        }

        if(contador <= 2) resultado = true;

        return resultado;
    }
}