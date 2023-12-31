/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoUsuarioImp;
import com.psicolife.dao.interfaces.DaoUsuario;
import com.psicolife.model.Usuario;
import com.psicolife.util.Regex;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Denni
 */
public class UsuarioValidator {
    private DaoUsuario dao;
    private HttpServletRequest request;
    private Regex regex;
    
    public UsuarioValidator(HttpServletRequest request){
        this.dao = new DaoUsuarioImp();
        this.request = request;
        this.regex = new Regex();
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
        
        String numeroCelular = request.getParameter("numeroCelular");
        String correo = request.getParameter("correo");
        int edad = Integer.valueOf(request.getParameter("edad"));
        Usuario test = dao.comprobarUser(correo);
        
        if ( edad >= 5 && edad < 100){
            if(regex.revisarNumero(numeroCelular)){
                if(regex.revisarCorreo(correo)){
                    if(test == null){

                        Usuario user = new Usuario();
                        user.setUsername(request.getParameter("username"));
                        user.setCorreo(correo);
                        user.setNumCelular(numeroCelular);
                        user.setEdad(edad);
                        user.setContraseña(request.getParameter("contraseña"));

                        result = dao.usuarioSet(user);

                    } else {
                        result = "Ya existe un usuario con este correo electronico.";
                    }
                } else {
                    result = "Direccion de correo electronico inválida.";
                }
            } else {
                result = "Numero celular inválido.";
            }
        } else {
            result = "Verifique la edad ingresada.";
        }
        return result;
    }
    
    public String usuarioUpd(){
        String result = null;
        
        String numeroCelular = request.getParameter("numeroCelular");
        String correo = request.getParameter("correo");
        int edad = Integer.valueOf(request.getParameter("edad"));
        
        if ( edad >= 5 && edad < 100){
            if(regex.revisarNumero(numeroCelular)){
                if(regex.revisarCorreo(correo)){

                        Usuario user = new Usuario();
                        user.setUsername(request.getParameter("username"));
                        user.setCorreo(correo);
                        user.setNumCelular(numeroCelular);
                        user.setEdad(edad);
                        user.setIdUsuario(Integer.parseInt(request.getParameter("userID")));
                        
                        result = dao.usuarioUpd(user);
            
                        if(result == null){
                            request.getSession().invalidate();
                            request.getSession().setAttribute("user", user);
                        }

                        result = (result == null) ? "Usuario modificado exitosamente." : result;

                } else {
                    result = "Direccion de correo electronico inválida.";
                }
            } else {
                result = "Numero celular inválido.";
            }
        } else {
            result = "Verifique la edad ingresada.";
        }       
                    
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
