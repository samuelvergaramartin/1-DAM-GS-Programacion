package superclases;

public abstract class Poligono {

    protected double base, altura;

    public Poligono(double base,double altura) {
        if(base <= 0) {
            System.out.println("La base debe ser mayor que 0.");
            this.base = 1;
        }
        else this.base = base;

        if(altura <= 0) {
            System.out.println("La altura debe ser mayor que 0.");
            this.altura = 1;
        }
        else this.altura = altura;
    }

    public abstract double area();
}
