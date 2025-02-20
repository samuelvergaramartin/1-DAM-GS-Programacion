public class Hora {
    private int hora, minutos;

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

    @Override
    public String toString() {
        return hora + ":" + (minutos < 10 ? "0" + minutos : String.valueOf(minutos));
    }
}
