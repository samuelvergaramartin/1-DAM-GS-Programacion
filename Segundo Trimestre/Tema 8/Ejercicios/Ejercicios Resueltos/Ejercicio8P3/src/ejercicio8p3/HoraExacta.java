package ejercicio8p3;

/**
 *
 * @author Samuel Vergara Martín
 */
public class HoraExacta extends Hora{
    protected int segundos;
    HoraExacta(int horas, int minutos, int segundos) {
        super(horas, minutos);
        if(segundos < 0 || segundos > 59) {
            this.segundos = 0;
        }
        else this.segundos = segundos;
    }
    
    void setSegundo(int value) {
        if(value < 0 || value > 59) {
            this.segundos = 0;
        }
        else this.segundos = value;
    }
    
    void inc() {
        if(this.minutos == 59 && this.segundos == 59) {
            this.horas++;
            this.minutos = 0;
            this.segundos = 0;
        }
        else {
            if(this.segundos == 59) {
                this.minutos++;
                this.segundos = 0;
            }
            else this.segundos++;
        }
    }
    
    boolean sonIguales(HoraExacta hora) {
        String hora2 = hora.toString();
        String hora1 = this.toString();
        if(hora1.equals(hora2)) return true;
        else return false;
    }
    
    @Override
    public String toString() {
        String result = super.toString() + ":" + this.segundos;
        return result;
    }
}
