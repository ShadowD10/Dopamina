/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.psicolife.web.servlets;

import com.psicolife.model.Usuario;
import com.psicolife.web.validators.UsuarioValidator;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Denni
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/Usuario"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");
        accion = (accion == null) ? "" : accion;
        String mensaje = null;
        String target = "register.jsp";
        
        UsuarioValidator validador = new UsuarioValidator(request);
        
        switch (accion) {
        
            case "SINGIN":
                
                    mensaje = validador.usuarioSet();
                    
                    target = (mensaje == null) ? "login.jsp" : "register.jsp" ;
                
                break;
            case "LOGIN":
                 mensaje = validador.usuarioLog();
                 if (mensaje == null){
                    target = "index.jsp";
                 } else {
                    target = "login.jsp";
                 }
                break;
            case "LOGOUT":
                    mensaje = validador.usuarioLogOut();
                    if (mensaje == null){
                        target = "index.jsp";
                    }
                break;
            case "ADMINLOGIN":
                    mensaje = validador.adminLog();
                    if (mensaje == null){
                        target = "Paciente?accion=LISTAR-AMD";
                    } else {
                        target = "loginAdmin.jsp";
                    }
                break;
            case "LISTAR":
                
                mensaje = validador.usuarioSel();
                target = "verUsuarios.jsp";
                
                break;
            case "UPD":
                
                mensaje = validador.usuarioUpd();
                target = "editarPerfil.jsp";
                
                break;
            default:
                break;
        
        }
        
        if(mensaje != null){
            request.setAttribute("mensaje", mensaje);
        }
        
        
        request.getRequestDispatcher(target).forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
