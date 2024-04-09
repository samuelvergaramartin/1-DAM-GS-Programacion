package actividadpopuesta9p5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Socio implements Comparable{
    int id;
    String nombre;
    LocalDate fechaNacimiento;
    
    public Socio(int id, String nombre, String fecha) {
        this.id = id;
        this.nombre = nombre;
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, f);
    }
    
    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    @Override
    public int compareTo(Object o) {
        int resultado;
        Socio otro = (Socio) o;
        
        resultado = id - otro.id;
        
        return resultado;
    }
    
    @Override
    public String toString() {
        String cadena = "\nId: " + id + " Nombre: " + nombre + " Edad: " + edad();
        return cadena;
    }
}
