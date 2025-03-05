public class Tiempo {
    private int horas, minutos, segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos < 0 || minutos > 59) System.out.println("Error: El numero de minutos debe estar entre 0 y 59");
        else this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas < 0) System.out.println("Error: El número de horas no puede ser menor que 0.");
        else this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if(segundos < 0 || segundos > 59) System.out.println("Error: El numero de segundos debe estar entre 0 y 59");
        else this.segundos = segundos;
    }

    public void suma(Tiempo t) {
        int h = horas, m = minutos, s = segundos;

        s+=t.segundos;
        if (s > 59) {
            m++;
            s-=60;
        }
        m+=t.minutos;
        if(m > 59) {
            h++;
            m-=60;
        }
        h+=t.horas;

        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }

    public void resta(Tiempo t) {
        int h = horas, m = minutos, s = segundos;

        s-=t.segundos;
        if(s < 0) {
            m--;
            s*=-1;
        }
        m-=t.minutos;
        if(m < 0) {
            h--;
            m*=-1;
        }
        h-=t.horas;

        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
    }
    //1h 23m 17s - 0h 45m 8s = 0h 22m 9s - MAL

    public void testResta(Tiempo t) {
        int h = horas, m = minutos, s = segundos;

        s-=t.segundos;
        if (s < 59) {
            m--;
            s+=60;
        }
        m-=t.minutos;
        if(m < 59) {
            h--;
            m+=60;
        }
        h-=t.horas;

        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
    }
    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}
