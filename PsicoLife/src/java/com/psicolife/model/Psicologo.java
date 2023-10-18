package com.psicolife.model;

public class Psicologo {
    private int idPsicologo;
    private String nombre;
    private String especialidad;
    private String numColegiatura;

    public Psicologo() {
    }

    public Psicologo(int idPsicologo, String nombre, String especialidad, String numColegiatura) {
        this.idPsicologo = idPsicologo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numColegiatura = numColegiatura;
    }

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumColegiatura() {
        return numColegiatura;
    }

    public void setNumColegiatura(String numColegiatura) {
        this.numColegiatura = numColegiatura;
    }

    
}
