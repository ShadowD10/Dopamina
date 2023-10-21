/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoCita;
import com.psicolife.model.Cita;
import com.psicolife.util.Conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author dmedi
 */
public class DaoCitaImp implements DaoCita {

    private String mensaje;
    private Conexion conn = new Conexion();
    
/*
-- Tabla Cita
SELECT id_cita, fecha_hora, id_mascota, id_corte, id_distrito FROM Cita

SELECT id_cita, fecha_hora, id_mascota, id_corte, id_distrito FROM Cita WHERE id_cita = ?}

INSERT INTO Usuario (id_cita, fecha_hora, id_mascota, id_corte, id_distrito) 
VALUES (cita_seq.NEXTVAL,?,?,?,?);
   
DELETE FROM Cita
WHERE id_cita = ?;
    
UPDATE Cita SET fecha_hora = ?, id_mascota = ?, id_corte = ?, id_distrito = ? WHERE id_cita = ?
*/    
    
    @Override
    public List<Cita> citaSel() {
        List<Cita> citas = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_cita, fecha_hora, id_tipo_cita, id_paciente")
            .append(" FROM Cita");
        
        try(Connection cn = conn.getConexion()){
            citas = new ArrayList();
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cita cita = new Cita();
                cita.setIdCita(rs.getInt(1));
                cita.setFechaHora(rs.getTimestamp(2));
                cita.setIdTipoCita(3);
                cita.setIdPaciente(rs.getInt(4));
            }
        }catch (Exception e){
            mensaje = e.getMessage();
        }
        
        return citas;
    }

    @Override
    public Cita citaGet(Integer id) {
        Cita cita = new Cita();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_cita, fecha_hora, id_tipo_cita, id_paciente")
            .append(" FROM Cita WHERE id_cita = ?");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cita.setIdCita(rs.getInt(1));
                cita.setFechaHora(rs.getTimestamp(2));
                cita.setIdTipoCita(3);
                cita.setIdPaciente(rs.getInt(4));
            } else {
                mensaje = "Esa cita no está registrada";
            }
        }catch (Exception e){
            mensaje=e.getMessage();
        }
        
        return cita;
    }

    @Override
    public List<Cita> listarCitasUsuario(Integer userID) {
        List<Cita> citas = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT cita.id_cita, cita.fecha_hora, paciente.nombre, tipo_cita.nombre, psicologo.nombre FROM Cita")
                .append(" INNER JOIN Paciente ON cita.id_paciente = paciente.id_paciente")
                .append(" INNER JOIN Tipo_Cita ON cita.id_tipo_cita = tipo_cita.id_tipo_cita")
                .append(" INNER JOIN Psicologo ON tipo_cita.id_psicologo = psicologo.id_psicologo")
                .append(" INNER JOIN Usuario ON paciente.id_usuario = usuario.id_usuario WHERE Usuario.id_usuario = ?");
        
        try(Connection cn = conn.getConexion()){
            citas = new ArrayList();
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            Cita cita = new Cita();
            cita.setIdCita(rs.getInt(1));
            cita.setFechaHora(rs.getTimestamp(2));
            cita.getTipoCita().setNombre(rs.getString(3));
            cita.getPaciente().setNombre(rs.getString(4));
            citas.add(cita);
            }
        }catch (Exception e){
            mensaje = e.getMessage();
        }
        
        return citas;
    }

    @Override
    public String citaSet(Cita cita) {
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Tipo_Cita (nombre, precio, descripcion, id_psicologo)")
                .append(" VALUES (?,?,?,?);");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, cita.getIdCita());
            ps.setTimestamp(2, cita.getFechaHora());
            ps.setInt(3, cita.getIdTipoCita());
            ps.setInt(4, cita.getIdPaciente());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros agregados";
            }
        }catch(Exception e){
            mensaje = e.getMessage();
        }
        
        return mensaje;
    }

    @Override
    public String citaUpd(Cita cita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String citaDel(Integer id) {
        
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM Cita")
            .append(" WHERE id_cita = ?;");
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            int resultado = ps.executeUpdate();
            if (resultado == 0){
                mensaje = "No se eliminaron registros.";
            }
        }catch(Exception e){
            mensaje = e.getMessage();
        }
        
        return mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public Cita citaVerificar(Timestamp fecha) {
        Cita cita = new Cita();
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_cita, fecha_hora, id_tipo_cita, id_paciente")
            .append(" FROM Cita WHERE fecha_hora = ?");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setTimestamp(1, fecha);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cita.setIdCita(rs.getInt(1));
                cita.setFechaHora(rs.getTimestamp(2));
                cita.setIdTipoCita(3);
                cita.setIdPaciente(rs.getInt(4));
            } else {
                mensaje = "Esa cita no está registrada";
            }
        }catch (Exception e){
            mensaje=e.getMessage();
        }
        
        return cita;
        
    }
    
}
