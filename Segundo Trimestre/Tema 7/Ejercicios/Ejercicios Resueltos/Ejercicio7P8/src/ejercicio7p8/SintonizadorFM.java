package ejercicio7p8;

/**
 *
 * @author Samuel Vergara Martín
 */
public class SintonizadorFM {
    private double frequence;
    private double rangeMax = 108;
    private double rangeMin = 80;
    private double saltoFrecuencia = 0.5;
    
    SintonizadorFM(int frecuencia) {
        if(frecuencia > this.rangeMax || frecuencia < this.rangeMin) this.frequence = this.rangeMin;
        else this.frequence = frecuencia;
    }
    
    SintonizadorFM() {
        this.frequence = this.rangeMin;
    }
    
    void increaseFrequence(double cantidad) {
        if(cantidad + this.frequence > this.rangeMax) {
            double n = this.rangeMax - cantidad;
            cantidad -= n;
            this.frequence = this.rangeMin;
            this.frequence += cantidad;
        }
        else this.frequence += cantidad;
    }
    
    void decreaseFrequence(double cantidad) {
        if(this.frequence - cantidad < this.rangeMin) {
            double n = cantidad - this.rangeMin;
            this.frequence = this.rangeMax;
            cantidad -= n;
            this.frequence -= cantidad;
        }
        else this.frequence -= cantidad;
    }
    
    void showFrequence() {
        System.out.println("Frecuencia actual: " + this.frequence);
    }
    
    double[] posiblesFrencuencias () {
        double min = this.rangeMin, max = this.rangeMax;
        int longitudArray = 1;
        double[] resultado;
        do {
            min+= this.saltoFrecuencia;
            longitudArray++;
        } while(min < max);
        resultado = new double[longitudArray];
        min = this.rangeMin;
        for(int i = 0; i < resultado.length; i++) {
            resultado[i] = min;
            min+= this.saltoFrecuencia;
        }
        
        return resultado;
    }
}
