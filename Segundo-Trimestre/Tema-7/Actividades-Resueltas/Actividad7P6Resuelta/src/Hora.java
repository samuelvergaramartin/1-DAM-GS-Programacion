public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas > 23 || horas < 0) {
            System.out.println("Error: El formato de hora introducido es incorrecto.");
        }
        else this.horas = horas;

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos > 59 || minutos < 0) {
            System.out.println("Error: El formato de minutos introducido es incorrecto.");
        }
        else this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos > 59 || segundos < 0) {
            System.out.println("Error: El formato de segundos introducido es incorrecto.");
        }
        else this.segundos = segundos;
    }

    public void incrementarUnSegundo() {
        final int seg = segundos, min = minutos, h = horas;

        if(seg >= 59) {
            segundos = 0;
            minutos++;

            if(min >= 59) {
                minutos = 0;
                horas++;

                if(h >= 23) {
                    horas = 0;
                }
                else horas++;
            }
            else minutos++;
        }
        else segundos++;

    }

    public String obtenerHoraCompleta() {
        String resultado = "";

        if(horas < 10) {
            resultado+= "0" + horas + ":";
        }
        else resultado+= horas + ":";

        if(minutos < 10) {
            resultado+= "0" + minutos + ":";
        }
        else resultado+= minutos + ":";

        if(segundos < 10) {
            resultado+= "0" + segundos;
        }
        else resultado+= segundos;

        return resultado;
    }
}
