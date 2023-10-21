package com.psicolife.dao.imp;

import com.psicolife.dao.interfaces.DaoContacto;
import com.psicolife.model.Contacto;
import com.psicolife.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Denni
 */
public class DaoContactoImp implements DaoContacto {
    
     private Conexion conn;
    private String mensaje;

    public DaoContactoImp() {
        conn = new Conexion();
    }
    @Override
    public String contactoSet(Contacto contacto) {
        //INSERT INTO contactanos (id_contacto, nombre, mensaje, correo,fecha_hora)
        //VALUES (contacto_seq.nextval, ?, ?, ?, ?)
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Contacto (nombre, correo, num_celular, mensaje, fecha) ")
                .append("VALUES (?, ?, ?, ?, ?)");
        
        try ( Connection cn = conn.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, contacto.getNombre());
            ps.setString(2, contacto.getCorreo());
            ps.setString(2, contacto.getNumCelular());
            ps.setString(4, contacto.getMensaje());
            ps.setString(5, contacto.getFechaHoraString());
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
    public String getMensaje() {
        return mensaje;
    }
    
}
