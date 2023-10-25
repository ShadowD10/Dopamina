
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoConsultaCitaImp;
import com.psicolife.dao.interfaces.DaoConsultaCita;
import com.psicolife.model.ConsultaCita;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ConsultaCitaValidator {
    
    private HttpServletRequest request;
    private DaoConsultaCita dao;
    
    public ConsultaCitaValidator (HttpServletRequest request){
        this.request = request;
        this.dao = new DaoConsultaCitaImp();
    }
    
    public String listarCitas(){
        String result = null;
        
        List<ConsultaCita> citas = dao.consultaCitaSel();
        
        if (citas != null){
            request.setAttribute("listaCitas", citas);
        } else {
            result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay citas registradas.";
            List<ConsultaCita> lista = null;
            request.setAttribute("listaCitas", lista);
        }
        
        return result;
    }
    
        public String listarCitasUser(){
        String result = null;
        
        List<ConsultaCita> citas = dao.consultaCitaGet(Integer.valueOf(request.getParameter("userID")));
        
        if (citas != null){
            request.setAttribute("listaCitas", citas);
        } else {
            result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay citas registradas.";
            List<ConsultaCita> lista = null;
            request.setAttribute("listaCitas", lista);
        }
        
        return result;
    }
        
}
