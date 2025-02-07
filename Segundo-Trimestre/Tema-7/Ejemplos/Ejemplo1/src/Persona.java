class Persona {
    String nombre;
    byte edad;
    double estatura;
    static String hoy = "Sábado";

    Persona(){}

    Persona(String nombre) {
        this.nombre = nombre;
    }

    Persona(String nombre, byte edad, double estatura) {
        this(nombre); //No se suele usar, pero se puede
        this.edad = edad;
        this.estatura = estatura;
    }

    static String hoyEs(int diaSemana) {
        String dia;

        dia = switch (diaSemana) {
            case 1 -> {
                yield "lunes";
            }
            default -> {
                yield "";
            }
        };

        return dia;
    }

    void asignarEdad(byte edad) {
        this.edad = edad;
    }

    void saludar() {
        System.out.println("Hola, me llamo " +  nombre);
    }

    void cumplirAnios() {
        edad++;
    }

    void crecer(double incremento) {
        estatura+= incremento;
    }
}
