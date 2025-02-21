package superclases;

public class Hora {
    protected int hora, minutos;

    public Hora(int hora, int minutos) {
        if(!setHora(hora)) System.out.println("Error: Formato de hora incorrecto.");
        if(!setMinutos(minutos)) System.out.println("Error: Formato de minutos incorrecto.");
    }

    public boolean setHora(int hora) {
        boolean resultado = false;

        if(hora >= 0 && hora <= 23) {
            this.hora = hora;
            resultado = true;
        }

        return resultado;
    }

    public boolean setMinutos(int minutos) {
        boolean resultado = false;

        if(minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            resultado = true;
        }

        return resultado;
    }

    public void inc() {
        if(minutos == 59) {
            minutos = -1;
            if(hora == 23) hora = -1;

            hora++;
        }

        minutos++;
    }

    @Override
    public String toString() {
        return hora + ":" + (minutos < 10 ? "0" + minutos : String.valueOf(minutos));
    }
}
