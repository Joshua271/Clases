package com.company;

public class Asignatura {

    private String asignatura;
    private String horario;
    private String modalidad;

    public Asignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getAsignatura() {
        return asignatura;
    }
}
