package ejercicio7p16aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P16Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto puntoA = new Punto(-5,-4);
        puntoA.desplazaX(3);
        puntoA.desplazaY(-2);
        Punto puntoB = new Punto(2,3);
        puntoB.desplaza(-2, -3);
        double resultadoFormula;
        resultadoFormula = puntoA.distanciaEuclidea(puntoB);
        System.out.println(resultadoFormula);
    }
    
}
