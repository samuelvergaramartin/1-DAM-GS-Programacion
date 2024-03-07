package ejercicio8p1;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Hora {
    int horas;
    int minutos;
    
    Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    void inc() {
        if(this.minutos == 59) this.minutos = 0;
        else this.minutos++;
    }
}
