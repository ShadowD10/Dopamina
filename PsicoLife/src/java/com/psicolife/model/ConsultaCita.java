package com.psicolife.model;

import java.sql.Timestamp;

public class ConsultaCita {
    private int idPaciente;
    private String nombrePaciente;
    private Timestamp fechaHora;
    private String nombreTipoCita;
    private String nombrePsicologo;
    private double precio;

    public ConsultaCita() {
    }

    public ConsultaCita(int idPaciente, String nombrePaciente, Timestamp fechaHora, String nombreTipoCita, String nombrePsicologo, double precio) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fechaHora = fechaHora;
        this.nombreTipoCita = nombreTipoCita;
        this.nombrePsicologo = nombrePsicologo;
        this.precio = precio;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombreTipoCita() {
        return nombreTipoCita;
    }

    public void setNombreTipoCita(String nombreTipoCita) {
        this.nombreTipoCita = nombreTipoCita;
    }

    public String getNombrePsicologo() {
        return nombrePsicologo;
    }

    public void setNombrePsicologo(String nombrePsicologo) {
        this.nombrePsicologo = nombrePsicologo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
