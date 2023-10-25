/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoPacienteImp;
import com.psicolife.dao.interfaces.DaoPaciente;
import com.psicolife.model.Paciente;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Paciente
 */
public class PacienteValidator {
    
    HttpServletRequest request;
    DaoPaciente dao;
    
    public PacienteValidator (HttpServletRequest request){
        this.request = request;
        this.dao = new DaoPacienteImp();
    }
    
    public String listarPacientesAdm() {
        String result = null;
        
        List<Paciente> pacientes = dao.pacienteSel();
            if(!pacientes.isEmpty()){
                request.setAttribute("listaPacientes", pacientes);
            } else {
                result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay pacientes.";
                List<Paciente> lista = null;
                request.setAttribute("listaPacientes", lista);
            }
        
        return result;
    }
    
    public String listarPacientesUsr(){
        String result = null;
        List<Paciente> pacientes = dao.pacienteUserGet(Integer.valueOf(request.getParameter("userID")));
        if(!pacientes.isEmpty()){
            request.setAttribute("listaPacientes", pacientes);
        } else {
            result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay pacientes.";
            List<Paciente> lista = null;
            request.setAttribute("listaPacientes", lista);
        }
        return result;
    }
    
}
