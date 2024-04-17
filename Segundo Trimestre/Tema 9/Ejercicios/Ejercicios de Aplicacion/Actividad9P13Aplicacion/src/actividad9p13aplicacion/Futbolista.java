package actividad9p13aplicacion;

import java.util.Comparator;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Futbolista implements Comparable, Comparator {
    private int dni;
    private int edad;
    private int nGoles;
    
    Futbolista(int dni, int edad, int nGoles) {
        this.dni = dni;
        this.edad = edad;
        this.nGoles = nGoles;
    }
    
    @Override
    public int compareTo(Object o) {
        int resultado;
        Futbolista otro = (Futbolista) o;
        
        resultado = dni - otro.dni;
        
        return resultado;
    }
    
    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio) o1).nombre.compareTo(((Socio) o2).nombre);
    }
    
    @Override
    public String toString() {
        return "DNI: " + dni + "\nEdad: " + edad + "\nNumero de goles: " + nGoles;
    }
    
    boolean equals(Futbolista f1, Futbolista f2) {
        if(f1.dni == f2.dni) return true;
        else return false;
    }
}
