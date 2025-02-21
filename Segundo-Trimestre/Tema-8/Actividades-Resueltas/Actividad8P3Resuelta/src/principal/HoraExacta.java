package principal;

import superclases.Hora;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundos(segundos);
    }

    public void setSegundos(int segundos) {
        if(segundos >= 0 && segundos <= 59) this.segundos = segundos;
        else System.out.println("Error: Formato de los segundos incorrecto.");
    }

    @Override
    public void inc() {
        if(segundos == 59) {
            segundos = -1;
            super.inc();
        }

        segundos++;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof HoraExacta)) return false;

        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ":" + (segundos < 10 ? "0" + segundos : String.valueOf(segundos));
    }
}
