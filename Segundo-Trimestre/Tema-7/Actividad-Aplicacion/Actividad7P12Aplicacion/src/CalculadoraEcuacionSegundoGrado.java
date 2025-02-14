public class CalculadoraEcuacionSegundoGrado {
    private double a, b, c;
    private Double x1, x2;

    public CalculadoraEcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Double[] obtenerResulados() {
        Double[] resultado = new Double[2];

        if(2*a == 0) {
            System.out.println("La ecuacion no tiene solución.");
            resultado[0] = x1;
            resultado[1] = x2;
        }
        else {
            if((Math.pow(b, 2) * -4*a*c) < 0) {
                System.out.println("La ecuacion no tiene solución.");
                resultado[0] = x1;
                resultado[1] = x2;
            }
            else {
                
            }
        }

        return resultado;
    }
}
