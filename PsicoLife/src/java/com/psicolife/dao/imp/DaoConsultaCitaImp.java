/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoConsultaCita;
import com.psicolife.model.ConsultaCita;
import com.psicolife.model.ConsultaCita;
import com.psicolife.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public class DaoConsultaCitaImp implements DaoConsultaCita {
    private final Conexion conn = new Conexion();
    private String mensaje;
    
    @Override
    public List<ConsultaCita> consultaCitaSel() {
            List<ConsultaCita> consultas = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ID, Paciente, fecha, tipo, psicologo, total")
                .append(" FROM VistaResultadosConsulta");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            consultas = new ArrayList<>();
            while (rs.next()){
                ConsultaCita consultaCita = new ConsultaCita();
                consultaCita.setIdPaciente(rs.getInt(1));
                consultaCita.setNombrePaciente(rs.getString(2));
                consultaCita.setFechaHora(rs.getTimestamp(3));
                consultaCita.setNombreTipoCita(rs.getString(4));
                consultaCita.setNombrePsicologo(rs.getString(5));
                consultaCita.setPrecio(rs.getDouble(6));
                consultas.add(consultaCita);
            }            
        } catch (Exception ex) {
            mensaje = ex.getMessage();
        }
        return consultas;    
    }
    
    @Override
    public List<ConsultaCita> consultaCitaGet(int idUsuario) {
        List<ConsultaCita> consultas = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT usuario.id_usuario, paciente.nombre, cita.fecha_hora, tipo_cita.nombre, psicologo.nombre, tipo_cita.precio " +
                    "FROM usuario " +
                    "RIGHT JOIN paciente ON usuario.id_usuario = paciente.id_usuario " +
                    "LEFT JOIN cita ON paciente.id_paciente = cita.id_paciente " +
                    "LEFT JOIN tipo_cita ON cita.id_tipo_cita = tipo_cita.id_tipo_cita " +
                    "LEFT JOIN psicologo ON tipo_cita.id_psicologo = psicologo.id_psicologo " +
                    "WHERE usuario.id_usuario = ?;");            
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            consultas = new ArrayList();
            while(rs.next()){
                ConsultaCita consultaCita = new ConsultaCita();
                consultaCita.setIdPaciente(rs.getInt(1));
                consultaCita.setNombrePaciente(rs.getString(2));
                consultaCita.setFechaHora(rs.getTimestamp(3));
                consultaCita.setNombreTipoCita(rs.getString(4));
                consultaCita.setNombrePsicologo(rs.getString(5));
                consultaCita.setPrecio(rs.getDouble(6));
                consultas.add(consultaCita);
            } 
        }catch (Exception e){
            mensaje=e.getMessage();
        }
        
        return consultas;
    }

    public String getMensaje(){
        return mensaje;
    }

    
}
