public class Caballo {
    private String nombre;
    private int edad;
    private String raza;


    public Caballo(String nombre, int edad, String raza) {
        this.nombre = nombre;
        setEdad(edad);
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0) System.out.println("Error: La edad no puede ser menor que 0");
        else this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        String cad = getClass().getSimpleName() + " {\n";

        cad+= "\tNombre: " + nombre + "\n";
        cad+= "\tEdad: " + edad + "\n";
        cad+= "\tRaza: " + raza + "\n}";

        return cad;
    }
}
