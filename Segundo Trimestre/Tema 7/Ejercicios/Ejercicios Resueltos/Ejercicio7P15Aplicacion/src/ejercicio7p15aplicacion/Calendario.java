package ejercicio7p15aplicacion;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Calendario {
    int year;
    int mes;
    int dia;
    int mesesDe30Dias[] = { 4, 6, 9, 11 };
    int mesesDe31Dias[] = { 1 , 3, 5, 7, 8, 10, 12 };
    private boolean tiene30 = false;
    private boolean tiene31 = false;
    String fecha;
    
    Calendario(int year, int mes, int dia) {
        if(year <= 0) {
            this.year = 1;
            System.out.println("Error: El year no puede ser negativo ni igual a 0. Se ha establecido en 1.");
        }
        else this.year = year;
        if(mes < 1 || mes > 12) {
            this.mes = 1;
            System.out.println("ERROR: El mes no puede ser menor que 1 ni mayor que 12. Se ha establecido en 1.");
        }
        else this.mes = mes;
        if(this.mes == 2 && dia > 28) {
            this.dia = 1;
            System.out.println("ERROR: Febrero no tiene mas de 28 dias.");
        }
        else {
            for(int i = 0; i < this.mesesDe30Dias.length; i++) {
                if(this.mesesDe30Dias[i] == mes) this.tiene30 = true;
            }
            for(int i = 0; i < this.mesesDe31Dias.length; i++) {
                if(this.mesesDe31Dias[i] == mes) this.tiene31 = true;
            }
            if(this.tiene30) {
                if(dia < 1 || dia > 30) {
                    this.dia = 1;
                    System.out.println("Error el mes seleccionado no puede tener menos de un dia ni mas de 30.");
                }
                else {
                    this.dia = dia;
                }
            }
            if(this.tiene31) {
                if(dia < 1 || dia > 31) {
                    this.dia = 1;
                    System.out.println("Error el mes seleccionado no puede tener menos de un dia ni mas de 31.");
                }
                else {
                    this.dia = dia;
                }
            }
        }
        this.fecha = this.dia + "/" + this.mes + "/" + this.year;
    }
    
    void mostrar() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.year);
    }
    
    void incrementarDia() {
        int maxDayOfMonth;
        if(this.tiene30) maxDayOfMonth = 30;
        if(this.tiene31) maxDayOfMonth = 31;
        else maxDayOfMonth = 28; //De febrero se entiende.
        
        if(this.dia == maxDayOfMonth) {
            if(this.mes == 12) {
                this.year++;
                this.mes = 1;
                this.dia = 1;
            }
            else {
                this.mes++;
                this.dia = 1;
            }
        }
        else this.dia++;
        this.fecha = this.dia + "/" + this.mes + "/" + this.year;
    }
    
    void incrementarMes() {
        if(this.mes == 12) {
            this.year++;
            this.mes = 1;
        }
        else {
            this.mes++;
        }
        this.fecha = this.dia + "/" + this.mes + "/" + this.year;
    }
    
    void incrementarYear() {
        this.year++;
        this.fecha = this.dia + "/" + this.mes + "/" + this.year;
    }
    
    boolean iguales(String fecha) {
        if(fecha.equals(this.fecha)) return true;
        else return false;
    }
}
