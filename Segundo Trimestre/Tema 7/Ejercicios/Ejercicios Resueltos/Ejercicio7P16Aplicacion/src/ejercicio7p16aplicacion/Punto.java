package ejercicio7p16aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Punto {
    double x;
    double y;
    
    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    void desplazaX(double dx) {
        this.x += dx;
    }
    
    void desplazaY(double dy) {
        this.y += dy;
    }
    
    void desplaza(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }
    
    double distanciaEuclidea(Punto otro) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = otro.x;
        double y2 = otro.y;
        double d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return d;
    }
    
    void mostrar() {
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
