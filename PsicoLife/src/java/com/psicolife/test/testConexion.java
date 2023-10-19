/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.test;

import com.psicolife.util.Conexion;

/**
 *
 * @author Denni
 */
public class testConexion {
    
    public static void main(String[] args) {
        Conexion conn = new Conexion();
        
        try {
            conn.getConexion();
            System.out.println("Conexion exitosa.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
