public class Main {
    public static void main(String[] args) {
        Double x1,x2, resultado[];
        CalculadoraEcuacionSegundoGrado calculadora = new CalculadoraEcuacionSegundoGrado(9,1,4);
        System.out.println(calculadora.esDiscriminantePositivo());

        resultado = calculadora.obtenerResulados();
        x1 = resultado[0];
        x2 = resultado[1];

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}