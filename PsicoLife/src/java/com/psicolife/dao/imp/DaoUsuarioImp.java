/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoUsuario;
import com.psicolife.model.Usuario;
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
public class DaoUsuarioImp implements DaoUsuario {
    
    private final Conexion conn = new Conexion();
    private String mensaje;
    
    @Override
    public List<Usuario> usuarioSel() {
        List<Usuario> usuarios = null;
        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_usuario, username, correo, num_celular, edad, contraseña")
                .append("FROM USUARIO");
        
        try(Connection cn = conn.getConexion()){
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            usuarios = new ArrayList<>();
            while (rs.next()){
                Usuario user = new Usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setCorreo(rs.getString(3));
                user.setNumCelular(rs.getString(4));
                user.setEdad(rs.getInt(5));
                user.setContraseña(rs.getString(6));
                usuarios.add(user);
            }            
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
        return usuarios;
    }

    @Override
    @SuppressWarnings("null")
    public Usuario usuarioGet(Integer id) {
        Usuario user = new Usuario();        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_usuario, username, correo, num_celular, edad, contraseña")
                .append("FROM USUARIO WHERE ID_USUARIO = ?");        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user.setIdUsuario(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setCorreo(rs.getString(3));
                user.setNumCelular(rs.getString(4));
                user.setEdad(rs.getInt(5));
                user.setContraseña(rs.getString(6));
            } else {
                mensaje="Usuario inexistente";
            }         
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return user;
    }

    @Override
    public String usuarioSet(Usuario usuario) {
        //INSERT INTO Usuario VALUES (usuario_seq.NEXTVAL,?,?,?,?)
        
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Usuario (username, correo, num_celular, edad, contraseña)")
                .append("VALUES (?, ?, ?, ?, ?)");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getNumCelular());
            ps.setInt(4, usuario.getEdad());
            ps.setString(5, usuario.getContraseña());
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
    public String usuarioUpd(Usuario usuario) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE Usuario SET username = ?, correo = ?, num_celular = ?, edad = ?, contraseña = ?")
                .append("WHERE ID_USUARIO=?");
         try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getNumCelular());
            ps.setInt(4, usuario.getEdad());
            ps.setString(5, usuario.getContraseña());
            ps.setInt(6, usuario.getIdUsuario());
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
    public String usuarioDel(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM Usuario ")                
                .append("WHERE ID_USUARIO=?");
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
    public Usuario UsuarioLog(Usuario usuario) {        
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT id_usuario, username, correo, num_celular, edad, contraseña")
                .append("FROM USUARIO WHERE CORREO = ? AND CONTRASEÑA= ?");        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, usuario.getContraseña());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setUsername(rs.getString(2));
                usuario.setCorreo(rs.getString(3));
                usuario.setNumCelular(rs.getString(4));
                usuario.setEdad(rs.getInt(5));
                usuario.setContraseña(rs.getString(6));
            } else {
                mensaje="Verifique los datos";
            }         
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }        
        return usuario;
    }
    
}
