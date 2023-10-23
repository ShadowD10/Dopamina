package com.psicolife.model;

public class Paciente {
    private int idPaciente;
    private int idUsuario;
    private String nombre;
    private String parentesco;
    private int edad;
    private Usuario usuario;

    public Paciente() {
    }


    public Paciente(int idPaciente, int idUsuario, String nombre, String parentesco, int edad, Usuario usuario) {
        this.idPaciente = idPaciente;
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.edad = edad;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
