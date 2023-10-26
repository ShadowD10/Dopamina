/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoPsicologoImp;
import com.psicolife.dao.interfaces.DaoPsicologo;
import com.psicolife.model.Psicologo;
import com.psicolife.model.Psicologo;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PsicologoValidator {
    
    DaoPsicologo dao;
    HttpServletRequest request;
    
    public PsicologoValidator (HttpServletRequest request){
        this.dao = new DaoPsicologoImp();
        this.request = request;
    }
    
    public String agregarPsicologo(){
        String result = null;
        
        Psicologo psicologo = new Psicologo();
        
        psicologo.setNombre(request.getParameter("name"));
        psicologo.setEspecialidad(request.getParameter("especialidad"));
        psicologo.setNumColegiatura(request.getParameter("codColegiatura"));
        
        result = dao.psicologoSet(psicologo);
        
        return result;    
    }
    
    public String listarPsicologo (){
        String result = null;
            List<Psicologo> psicologos = dao.psicologoSel();
            if(psicologos != null){
                request.setAttribute("listaPsicologos", psicologos);
            }else{
                result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay psicologos registrados.";
                List<Psicologo> lista = null;
                request.setAttribute("listaPsicologos", lista);
            }
        return result;
    }
    
    public String seleccionarPsicologo () {
        String result = null;
            Psicologo psicologo = dao.psicologoGet(Integer.valueOf(request.getParameter("psicologoId")));
            if (psicologo.getNombre() != null){
                request.setAttribute("psicologo", psicologo);
            } else {
                result = dao.getMensaje();
            }
        return result;
    }
    
    public String actualizarPsicologo () {
        String result = null;
            Psicologo psicologo = new Psicologo ();
            psicologo.setNombre(request.getParameter("name"));
            psicologo.setEspecialidad(request.getParameter("especialidad"));
            psicologo.setNumColegiatura(request.getParameter("numColegiatura"));
            psicologo.setIdPsicologo(Integer.valueOf(request.getParameter("idPsicologo")));
            
            result = dao.psicologoUpd(psicologo);
            
        return result;
    }
    
    public String eliminarPsicologo () {
        String result = null;
        
        result = dao.psicologoDel(Integer.valueOf(request.getParameter("psicologoId")));
        
        return result;
    }
    
}
