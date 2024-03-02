public class TareaFinal1P20 {
    public static void main(String[] args) {
        Double nReal, resultado;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        String msgResult;

        System.out.print("Introduce un numero real: ");
        nReal = sc.nextDouble();

        resultado = Math.sqrt(nReal);

        msgResult = nReal <= 0 ? "ERROR: El numero introducido debe ser mayor que 0" : "La raiz cuadrada de " + nReal +  " es " + resultado;
        System.out.println(msgResult);

        sc.close();
    }
}
