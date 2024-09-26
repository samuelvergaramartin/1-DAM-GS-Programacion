public class Main {
    public static void main(String[] args) {
        double nReal, result;

        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.print("Introduce un número real: ");
        nReal = sc.nextDouble();

        result = Math.sqrt(nReal);

        System.out.println("La raíz cuadrada de " + nReal + " es " + result);
    }
}