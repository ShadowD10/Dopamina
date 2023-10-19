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
        
        user.setUsername("Den");
        user.setCorreo("Den");
        user.setNumCelular("999999999");
        user.setEdad(20);
        user.setContraseña("123456789");
        
        System.out.println(dao.usuarioSet(user));
        
    }
}
