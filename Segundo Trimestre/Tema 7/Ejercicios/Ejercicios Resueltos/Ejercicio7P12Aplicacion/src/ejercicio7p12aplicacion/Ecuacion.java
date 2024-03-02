package ejercicio7p12aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ecuacion {
    double a;
    double b;
    double c;
    double result1;
    double result2;
    
    Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    double[] getResults() {
        double results[] = new double[2];
        result1 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2*this.a);
        result2 = (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2*this.a);
        results[0] = result1;
        results[1] = result2;
        return results;
    }
    
    double[] getResults(double a, double b, double c) {
        double results[] = new double[2];
        result1 = (b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
        result2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
        results[0] = result1;
        results[1] = result2;
        return results;
    }
}
