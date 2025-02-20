package principal;

import profesiones.Estudiante;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Juan", (byte) 50, 182, 1900);
        Empleado e2 = new Empleado("Juan", (byte) 50, 182, 1900);

        System.out.println(e.equals(e2));
        System.out.println(e.getClass().getSuperclass());
    }
}