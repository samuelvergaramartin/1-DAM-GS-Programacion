public class Persona {
    private String nombre;
    private int edad;
    private char sexo;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0) this.edad = 0;
        else this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
