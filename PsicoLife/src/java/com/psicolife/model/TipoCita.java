package com.psicolife.model;

public class TipoCita {
    private int idTipoCita;
    private int idPsicologo;
    private String nombre;
    private Double precio;
    private String descripcion;

    public TipoCita() {
    }

    public TipoCita(int idTipoCita, int idPsicologo, String nombre, Double precio, String descripcion) {
        this.idTipoCita = idTipoCita;
        this.idPsicologo = idPsicologo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }



    public int getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(int idTipoCita) {
        this.idTipoCita = idTipoCita;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
