/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.test;

import com.psicolife.dao.imp.DaoUsuarioImp;
import com.psicolife.dao.interfaces.DaoUsuario;
import com.psicolife.model.Usuario;

/**
 *
 * @author Denni
 */
public class testDaoUsuarioImp {
    public static void main(String[] args) {
        DaoUsuario dao = new DaoUsuarioImp();
        Usuario user = new Usuario();
        

        user.setCorreo("dennijosu18@gmail.com");
        user.setContraseña("Denni18");
        
        user = dao.UsuarioLog(user);
        
        System.out.println(user.getUsername());
        
    }
}
