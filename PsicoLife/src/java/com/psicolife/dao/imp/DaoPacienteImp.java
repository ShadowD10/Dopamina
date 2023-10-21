/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoPaciente;
import com.psicolife.model.Paciente;
import com.psicolife.util.Conexion;
import java.util.List;
import org.apache.tomcat.dbcp.dbcp2.PoolingConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Denni 
 */
public class DaoPacienteImp implements DaoPaciente {
    
    private final Conexion conn = new Conexion();
    private String mensaje;
    
    @Override
    public List<Paciente> pacienteSel() {
        List<Paciente> pacientes = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_paciente, nombre, parentezco, edad, id_usuario")
                .append(" FROM PACIENTE");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            pacientes = new ArrayList<>();
            while (rs.next()){
                Paciente user = new Paciente();
                user.setIdPaciente(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setParentesco(rs.getString(3));
                user.setEdad(rs.getInt(4));
                user.setIdUsuario(rs.getInt(5));
                pacientes.add(user);
            }            
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return pacientes;
    }

    @Override
    @SuppressWarnings("null")
    public Paciente pacienteGet(Integer id) {
        Paciente user = new Paciente();        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_paciente, nombre, parentezco, edad, id_usuario")
                .append(" FROM PACIENTE WHERE ID_PACIENTE = ?");        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user.setIdPaciente(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setParentesco(rs.getString(3));
                user.setEdad(rs.getInt(4));
                user.setIdUsuario(rs.getInt(5));
            } else {
                mensaje="Paciente inexistente";
            }         
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return user;
    }

    @Override
    public String pacienteSet(Paciente paciente) {
        //INSERT INTO Paciente VALUES (paciente_seq.NEXTVAL,?,?,?,?)
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Paciente (nombre, parentezco, edad, id_usuario)")
                .append(" VALUES ( ?, ?, ?, ?)");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getParentesco());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getIdUsuario());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros agregados";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        
        return mensaje;
    }

    @Override
    public String pacienteUpd(Paciente paciente) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE Paciente SET nombre = ?, parentezco = ?, edad = ?, id_usuario = ?")
                .append(" WHERE ID_PACIENTE=?");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getParentesco());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getIdUsuario());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros modificados";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        
        return mensaje;
    }

    @Override
    public String pacienteDel(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM Paciente")                
                .append(" WHERE ID_PACIENTE=?");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros eliminados";
            } else {
                mensaje = "Eliminacion exitosa";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public Paciente pacienteUserGet(Integer idUser) {
         Paciente paciente = new Paciente();
        
                StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_paciente, nombre, parentezco, edad, id_usuario")
                .append(" FROM Paciente WHERE id_usuario = ?");  
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                paciente.setIdPaciente(rs.getInt(1));
                paciente.setNombre(rs.getString(2));
                paciente.setParentesco(rs.getString(3));
                paciente.setEdad(rs.getInt(4));
                paciente.setIdUsuario(rs.getInt(5));
            } else {
                mensaje = "No existe ese paciente";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        
        return paciente;
    }
    
}
