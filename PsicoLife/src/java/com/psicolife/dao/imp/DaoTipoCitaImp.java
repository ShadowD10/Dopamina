/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoTipoCita;
import com.psicolife.model.TipoCita;
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
public class DaoTipoCitaImp implements DaoTipoCita {
    
    private final Conexion conn = new Conexion();
    private String mensaje;
    
    @Override
    public List<TipoCita> tipoCitaSel() {
        List<TipoCita> tipoCitas = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_tipoCita, nombre, precio, descripcion, id_psicologo ")
                .append("FROM Tipo_Cita");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            tipoCitas = new ArrayList<>();
            while (rs.next()){
                TipoCita user = new TipoCita();
                user.setIdTipoCita(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setPrecio(rs.getDouble(3));
                user.setDescripcion(rs.getString(4));
                user.setIdPsicologo(rs.getInt(5));
                tipoCitas.add(user);
            }            
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return tipoCitas;
    }

    @Override
    @SuppressWarnings("null")
    public TipoCita tipoCitaGet(Integer id) {
        TipoCita user = new TipoCita();        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_tipo_cita, nombre, precio, descripcion, id_psicologo ")
                .append("FROM Tipo_Cita WHERE ID_TIPO_CITA = ?");        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user.setIdTipoCita(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setPrecio(rs.getDouble(3));
                user.setDescripcion(rs.getString(4));
                user.setIdPsicologo(rs.getInt(5));
            } else {
                mensaje="TipoCita inexistente";
            }         
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return user;
    }

    @Override
    public String tipoCitaSet(TipoCita tipoCita) {
        //INSERT INTO TipoCita VALUES (tipoCita_seq.NEXTVAL,?,?,?,?)
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Tipo_Cita (nombre, precio, descripcion, id_psicologo) ")
                .append("VALUES ( ?, ?, ?, ?)");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipoCita.getNombre());
            ps.setDouble(2, tipoCita.getPrecio());
            ps.setString(3, tipoCita.getDescripcion());
            ps.setInt(4, tipoCita.getIdPsicologo());
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
    public String tipoCitaUpd(TipoCita tipoCita) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE Tipo_Cita SET nombre = ?, precio = ?, descripcion = ?, id_psicologo = ?  ")
                .append("WHERE ID_TIPO_CITA=?");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipoCita.getNombre());
            ps.setDouble(2, tipoCita.getPrecio());
            ps.setString(3, tipoCita.getDescripcion());
            ps.setInt(4, tipoCita.getIdPsicologo());
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
    public String tipoCitaDel(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM TipoCita ")                
                .append("WHERE ID_TIPO_CITA=?");
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
    public TipoCita tipoCitaUserGet(Integer idUser) {
         TipoCita tipoCita = new TipoCita();
        
                StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_tipo_cita, nombre, precio, descripcion, id_psicologo ")
                .append(" FROM Tipo_Cita WHERE id_psicologo = ?");  
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tipoCita.setIdTipoCita(rs.getInt(1));
                tipoCita.setNombre(rs.getString(2));
                tipoCita.setPrecio(rs.getDouble(3));
                tipoCita.setDescripcion(rs.getString(4));
                tipoCita.setIdPsicologo(rs.getInt(5));
            } else {
                mensaje = "No existe ese tipo de cita";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        
        return tipoCita;
    }
    
}
