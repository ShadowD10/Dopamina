package com.dopamina.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Denni Medina
 */
public class Conexion {
    
    private final String URL = "jdbc:mysql://localhost:3307/mysql ";
    private final String USER = "root";    
    private final String PASS = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public Connection getConexion() throws SQLException {    
        Connection c = null;
        try {
            Class.forName(DRIVER).newInstance();
            c = DriverManager.getConnection(URL, USER, PASS);
//            JOptionPane.showMessageDialog(null, "Conexión exitosa.");
        } catch (ClassNotFoundException | 
                 IllegalAccessException | 
                 InstantiationException | 
                 SQLException e) {
            throw new SQLException (e.getMessage());
        }
        return c;    
    }
     
}
