public class Calendario {
    private int anio = 1, mes = 1, dia = 1;

    public Calendario(int anio, int mes, int dia) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public void setAnio(int anio) {
        if(anio <= 0) System.out.println("Error: El año introducido debe ser mayor que 0.");
        else this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes > 12) System.out.println("Error: El número del mes introducido no es válido.");
        else this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        final int MAX;

        switch (mes) {
            case 1,3,5,7,8,10,12: {
                MAX = 31;
                break;
            }
            case 2: {
                MAX = 28;
                break;
            }
            default: {
                MAX = 30;
                break;
            }
        }

        if(dia < 1 || dia > MAX) System.out.println("Error: El número del día introducido no es válido.");
        else this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void incrementarDia() {
        final int MAX;

        switch (mes) {
            case 1,3,5,7,8,10,12: {
                MAX = 31;
                break;
            }
            case 2: {
                MAX = 28;
                break;
            }
            default: {
                MAX = 30;
                break;
            }
        }

        if(dia == MAX) {
            dia = 0;
            incrementarMes();
        }

        dia++;
    }

    public void incrementarMes() {
        if(mes == 12) {
            mes = 0;
            incrementarAnio();
        }

        mes++;
    }

    public void incrementarAnio() {
        anio++;
    }

    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }

    public boolean iguales(Calendario otraFecha) {
        return otraFecha.toString().equals(this.toString());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{\n\tDia: " + dia + "\n\t" + "Mes: " + mes + "\n\tAño: " + anio + "\n}";
    }
}
