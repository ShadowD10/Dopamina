
package com.dopamina.test;

import com.dopamina.util.Conexion;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class testConexion {
    
    public static void main(String[] args) throws SQLException {
        
        Conexion conn = new Conexion();
        
        conn.getConexion();
        
    }
    
}
