public class Fraccion {
    private double numerador;
    private double denominador = 1;

    public Fraccion(double numerador, double denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        if(denominador == 0) System.out.println("Error: El denominador nunca puede ser 0.");
        else this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public void invierte() {
        double aux;
        if(numerador == 0) System.out.println("Error: No se puede invertir");
        else {
            aux = denominador;
            denominador = numerador;
            numerador = aux;
        }
    }

    public void simplifica() {
        final double MCD = mcd(denominador, numerador);

        denominador = denominador / MCD;
        numerador = numerador / MCD;
    }

    public double multiplicar(double numero) {
        return ((numerador*numero)/denominador);
    }

    public Fraccion multiplicar(Fraccion otraFraccion) {
        return new Fraccion(numerador*otraFraccion.numerador, denominador*otraFraccion.denominador);
    }

    public Double divide(double numero) {
        Double resultado = null;

        if(numero != 0) {
            resultado = (numerador/denominador)/numero;
        }
        else System.out.println("Error: No se puede dividir entre 0.");

        return resultado;
    }

    public Fraccion divide(Fraccion otraFraccion) {
        return new Fraccion(numerador*otraFraccion.denominador, denominador*otraFraccion.numerador);
    }

    private double mcd(double num1, double num2) {
        double resultado, min, max;

        if(num1 == 0) {
            resultado = num2;
        }
        else if(num2 == 0) {
            resultado = num1;
        }
        else {
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);

            resultado = mcd(min, max-min);
        }

        return resultado;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
