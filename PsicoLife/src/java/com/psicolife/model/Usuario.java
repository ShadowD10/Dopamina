package com.psicolife.model;

public class Usuario {
    private int idUsuario;
    private String username;
    private String correo;
    private String numCelular;
    private int edad;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String correo, String numCelular, int edad, String contraseña) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.correo = correo;
        this.numCelular = numCelular;
        this.edad = edad;
        this.contraseña = contraseña;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}