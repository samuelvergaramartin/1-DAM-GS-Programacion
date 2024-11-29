
public class Main {
    public static void main(String[] args) {
        for (int precision = 1; precision <= 10; precision++){

            System.out.println("\n\n-- PRECISION " + precision + " --");
            System.out.printf("Con precision " + precision + " el e elevado a 1 es: " + exponencial(1,precision));
            System.out.printf("\nCon precision " + precision + " el e elevado a 2 es: " + exponencial(2,precision));
            System.out.printf("\nCon precision " + precision + " el e elevado a 5 es: " + exponencial(5,precision));
        }
    }

    private static double exponencial(double x, double precision) {
        double resultado = 1;

        for(int i = 1; i <= precision; i++) {
            resultado+= ((Math.pow(x, i))/(factorial(i)));
        }

        return resultado;
    }

    private static int factorial(int num) {
        int resultado = 1;

        for(int i = 1; i <= num; i++) {
            resultado*= i;
        }

        return resultado;
    }
}