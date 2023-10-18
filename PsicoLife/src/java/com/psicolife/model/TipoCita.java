package com.psicolife.model;

public class TipoCita {
    private int idTipoCita;
    private String nombre;
    private Double precio;
    private String descripcion;
    private Psicologo psicologo;

    public TipoCita() {
    }

    public TipoCita(int idTipoCita, String nombre, Double precio, String descripcion, Psicologo psicologo) {
        this.idTipoCita = idTipoCita;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.psicologo = psicologo;
    }

    public int getIdTipoCita() {
        return idTipoCita;
    }

    public void setIdTipoCita(int idTipoCita) {
        this.idTipoCita = idTipoCita;
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

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }
    
    
}
