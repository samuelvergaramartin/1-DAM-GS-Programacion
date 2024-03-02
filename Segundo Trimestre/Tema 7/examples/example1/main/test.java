package examples.example1.main;
import examples.example1.instituto.Profesor;
public class test {
    public static void main(String[] args) {
        /*Alumno a = new Alumno("Pepe", "368363", 23, 1, "3688684A");
        Alumno b = new Alumno(23);
        System.out.println(a.dni);
        System.out.println(b.edad);*/
        
        
        Profesor p = new Profesor("Pepe", "123456A", 2);
        
        System.out.println(p.nombre);
    }
}