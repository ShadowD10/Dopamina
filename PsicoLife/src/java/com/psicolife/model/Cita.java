package com.psicolife.model;

import java.sql.Timestamp;

public class Cita {
    private int idCita;
    private Timestamp fechaHora;
    private TipoCita tipoCita;
    private Paciente paciente;

    public Cita() {
    }

    public Cita(int idCita, Timestamp fechaHora, TipoCita tipoCita, Paciente paciente) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.tipoCita = tipoCita;
        this.paciente = paciente;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public TipoCita getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(TipoCita tipoCita) {
        this.tipoCita = tipoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
