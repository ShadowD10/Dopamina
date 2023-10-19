/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoPsicologo;
import com.psicolife.model.Psicologo;
import com.psicolife.util.Conexion;
import java.util.List;
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
public class DaoPsicologoImp implements DaoPsicologo {
    
    private final Conexion conn = new Conexion();
    private String mensaje;
    
    @Override
    public List<Psicologo> psicologoSel() {
        List<Psicologo> psicologos = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_psicologo, nombre, especialidad, num_colegiatura ")
                .append("FROM PSICOLOGO");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            psicologos = new ArrayList<>();
            while (rs.next()){
                Psicologo user = new Psicologo();
                user.setIdPsicologo(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setEspecialidad(rs.getString(3));
                user.setNumColegiatura(rs.getString(4));
                psicologos.add(user);
            }            
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return psicologos;
    }

    @Override
    @SuppressWarnings("null")
    public Psicologo psicologoGet(Integer id) {
        Psicologo user = new Psicologo();        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_psicologo, nombre, especialidad, num_colegiatura ")
                .append("FROM PSICOLOGO WHERE ID_PSICOLOGO = ?");        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user.setIdPsicologo(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setEspecialidad(rs.getString(3));
                user.setNumColegiatura(rs.getString(4));
            } else {
                mensaje="Psicologo inexistente";
            }         
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return user;
    }

    @Override
    public String psicologoSet(Psicologo psicologo) {
        //INSERT INTO Psicologo VALUES (psicologo_seq.NEXTVAL,?,?,?,?)
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Psicologo (nombre, especialidad, num_colegiatura) ")
                .append("VALUES (?, ?, ?)");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, psicologo.getNombre());
            ps.setString(2, psicologo.getEspecialidad());
            ps.setString(3, psicologo.getNumColegiatura());
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
    public String psicologoUpd(Psicologo psicologo) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE Psicologo SET nombre = ?, especialidad = ?, num_colegiatura = ? ")
                .append("WHERE ID_PSICOLOGO=?");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, psicologo.getNombre());
            ps.setString(2, psicologo.getEspecialidad());
            ps.setString(3, psicologo.getNumColegiatura());
            ps.setInt(4, psicologo.getIdPsicologo());
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
    public String psicologoDel(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM Psicologo ")                
                .append("WHERE ID_PSICOLOGO=?");
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
    
}
