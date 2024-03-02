package ejercicio7p6;

/**
 *
 * @author Samuel Vergara Martín
 */
class Hora {
    private int horas;
    private int minutos;
    private int segundos;
    private boolean dataIsValid = true;
    
    Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    void setHoras(int horas) {
        this.horas = horas;
    }
    void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    boolean checkData() {
        if(this.horas > 24 || this.horas < 0) dataIsValid = false;
        if(this.minutos > 60 || this.minutos < 0) dataIsValid = false;
        if(this.segundos > 60 || this.segundos < 0) dataIsValid = false;
        
        return dataIsValid;
    }
    
    int getHoras() {
        return this.horas;
    }
    int getMinutos() {
        return this.minutos;
    }
    int getSegundos() {
        return this.segundos;
    }
    
    void incrementarEnSegundos(int nSegundos) {
        int incHoras, incMinutos, incSegundos;
        
        incHoras = nSegundos / 3600;
        nSegundos %= 3600;
        
        incMinutos = nSegundos / 60;
        nSegundos %= 60;
        
        incSegundos = nSegundos;
        
        this.horas += incHoras;
        this.minutos += incMinutos;
        this.segundos += incSegundos;
    }
}
