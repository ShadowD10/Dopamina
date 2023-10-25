
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoTipoCitaImp;
import com.psicolife.dao.interfaces.DaoTipoCita;
import com.psicolife.model.TipoCita;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TerapiaValidator {
    
    HttpServletRequest request;
    DaoTipoCita dao;
    
    public TerapiaValidator(HttpServletRequest request){
    
        this.request = request;
        this.dao = new DaoTipoCitaImp();
        
    }
    
    public String listarTipos(){
        String result = null;
            
        List<TipoCita> listaTerapias = dao.tipoCitaSel();
        
        if(listaTerapias!=null){
            request.setAttribute("listaTerapias", listaTerapias);
        } else {
            result = (dao.getMensaje() != null) ? dao.getMensaje() : "No hay tipos de citas.";
            List<TipoCita> lista = null;
            request.setAttribute("listaTerapias", lista);
       }
        
        return result;
    }
}
