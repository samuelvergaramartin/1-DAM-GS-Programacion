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
        if(this.minutos == 59) {
            this.minutos = 0;
            this.horas++;
        }
        else this.minutos++;
    }
    
    boolean setMinutos(int value) {
        if(value < 60 || value > 0) {
            this.minutos = value;
            return true;
        }
        else return false;
    }
    
    boolean setHora(int value) {
        if(value >= 0 || value <= 23) {
            this.horas = value;
            return true;
        }
        else return false;
    }
    
    @Override
    public String toString() {
        String result = this.horas + ":" + this.minutos;
        return result;
    }
}
