/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoUsuarioImp;
import com.psicolife.dao.interfaces.DaoUsuario;
import com.psicolife.model.Usuario;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Denni
 */
public class UsuarioValidator {
    private DaoUsuario dao;
    private HttpServletRequest request;
    
    public UsuarioValidator(HttpServletRequest request){
        this.dao = new DaoUsuarioImp();
        this.request = request;
    }
    
    public String usuarioSel(){
        String result = null;
              
            List<Usuario> usuarios = dao.usuarioSel();
            if(usuarios != null){
                request.setAttribute("listaUsuarios", usuarios);
            }else{
                result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay usuarios.";
                List<Usuario> lista = null;
                request.setAttribute("listaUsuarios", lista);
            }
        
        return result;
    }
    
    public String usuarioGet(){
        String result = null;
        
            int userID = Integer.valueOf(request.getParameter("userID"));

            Usuario user = dao.usuarioGet(userID);

            if(user != null){
                request.setAttribute("usuario", user);
            } else {
                result = dao.getMensaje();
            }
        
        return result;    
    }
    
    public String usuarioSet() {
        String result = null;
        
            Usuario user = new Usuario();
            user.setUsername(request.getParameter("username"));
            user.setCorreo(request.getParameter("correo"));
            user.setNumCelular(request.getParameter("numeroCelular"));
            user.setEdad(Integer.valueOf(request.getParameter("edad")));
            user.setContraseña(request.getParameter("contraseña"));
            
            result = dao.usuarioSet(user);
            
        return result;
    }
    
    public String usuarioUpd(){
        String result = null;
        
            Usuario user = new Usuario();
            user.setUsername(request.getParameter("username"));
            user.setCorreo(request.getParameter("correo"));
            user.setNumCelular(request.getParameter("numeroCelular"));
            user.setEdad(Integer.valueOf(request.getParameter("edad")));
            user.setContraseña(request.getParameter("contraseña"));
            
            result = dao.usuarioUpd(user);
        
        return result;
    }
    
    public String usuarioDel(){
        String result = null;
        
            int userID = Integer.valueOf(request.getParameter("userID"));
            
            result = dao.usuarioDel(userID);
        
        return result;
    }
    
    public String usuarioLog(){
        String result = null;
            
            Usuario user = new Usuario();
            user.setCorreo(request.getParameter("correo"));
            user.setContraseña(request.getParameter("contraseña"));
            
            Usuario usuario = dao.UsuarioLog(user);
            
            if (usuario.getUsername() != null) {
                request.getSession().setAttribute("user", usuario);
            } else {
                result = dao.getMensaje();
            }
        
        return result;
    }
    
    public String adminLog(){
        String result = null;
            
            Usuario user = new Usuario();
            user.setCorreo(request.getParameter("correo"));
            user.setContraseña(request.getParameter("contraseña"));
            
            Usuario usuario = dao.UsuarioLog(user);
            
            if (usuario.getUsername() != null) {
                if (usuario.isAdmin()==1){
                    request.getSession().setAttribute("userAdmin", usuario);
                } else {
                    result = "No es una sesion de administrador.";
                }
            } else {
                result = dao.getMensaje();
            }
        
        return result;
    }
    
    public String usuarioLogOut(){
        String result = null;                        

                request.getSession().removeAttribute("user");
                request.getSession().invalidate();
        
        return result;
    }

}
