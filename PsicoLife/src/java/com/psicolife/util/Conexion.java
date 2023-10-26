package com.psicolife.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String URL = "jdbc:mysql://127.0.0.1:3306/admin_pscolife?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USER = "admin_pscolife";
    private final String PASS = "Psicolife23.";

    public Connection getConexion() throws SQLException {
        Connection c = null;
        try {
            Class.forName(DRIVER).newInstance();
            c = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException e) {
            throw new SQLException(e.getMessage());
        }

        return c;
    }
}
