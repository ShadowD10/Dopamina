/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.psicolife.dao.interfaces;

import com.psicolife.model.Usuario;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoUsuario {
    List<Usuario> usuarioSel(); //SELECT * FROM
    Usuario usuarioGet(Integer id); //SELECT * FROM WHERE
    String usuarioSet(Usuario usuario); //INSERT 
    String usuarioUpd(Usuario usuario); //UPDATE
    String usuarioDel(Integer id); //DELETE
    Usuario UsuarioLog(Usuario usuario); //SELECT * FROM WHERE contraseña = c AND usuario = u
    String getMensaje();   
}
