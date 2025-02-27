package principal;

import superclases.Poligono;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        if(base <= 0) {
            System.out.println("La base debe ser mayor que 0.");
            super.base = 1;
        }
        else super.base = base;

        if(altura <= 0) {
            System.out.println("La altura debe ser mayor que 0.");
            super.altura = 1;
        }
        else super.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
