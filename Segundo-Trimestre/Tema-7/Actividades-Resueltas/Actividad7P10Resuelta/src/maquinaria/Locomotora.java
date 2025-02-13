package maquinaria;

import personal.Mecanico;

public class Locomotora {
    private final String matricula;
    private String potenciaMotores;
    private final String antiguedad;
    private Mecanico mecanico;

    public Locomotora(String matricula, String antiguedad, String potenciaMotores, Mecanico mecanico) {
        this.matricula = matricula;
        this.antiguedad = antiguedad;
        this.potenciaMotores = potenciaMotores;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getPotenciaMotores() {
        return potenciaMotores;
    }

    public void setPotenciaMotores(String potenciaMotores) {
        this.potenciaMotores = potenciaMotores;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
}
