public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void desplazaX(double dx) {
        x+= dx;
    }

    public void desplazaY(double dy) {
        y+= dy;
    }

    public void desplaza(double dx, double dy) {
        desplazaX(dx);
        desplazaY(dy);
    }

    public double distanciaEuclidea(Punto otro) {
        return Math.pow((otro.getX() - x), 2) + Math.pow((otro.getY() - y), 2);
    }

    public void muestra() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tX: " + x + "\n\tY: " + y + "\n}";
    }
}
