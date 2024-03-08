package ejercicio8p3;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Hora {
    protected int horas;
    protected int minutos;
    
    protected Hora(int horas, int minutos) {
        if(horas < 0 || horas > 23) {
            this.horas = 0;
        }
        else this.horas = horas;
        if(minutos < 0 || minutos > 59) {
            this.minutos = 0;
        }
        else this.minutos = minutos;
    }
    
    void inc() {
        if(this.minutos == 59) {
            this.minutos = 0;
            this.horas++;
        }
        else this.minutos++;
    }
    
    protected boolean setMinutos(int value) {
        if(value < 60 || value > 0) {
            this.minutos = value;
            return true;
        }
        else return false;
    }
    
    protected boolean setHora(int value) {
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
