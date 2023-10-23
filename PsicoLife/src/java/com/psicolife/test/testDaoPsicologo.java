
package com.psicolife.test;

import com.psicolife.dao.imp.DaoPsicologoImp;
import com.psicolife.dao.interfaces.DaoPsicologo;
import com.psicolife.model.Psicologo;

/**
 *
 * @author Denni
 */
public class testDaoPsicologo {
    public static void main(String[] args) {
        
        String result;
        DaoPsicologo dao = new DaoPsicologoImp();
        Psicologo psicologo = new Psicologo();
        
        psicologo.setNombre("Pedro");
        psicologo.setEspecialidad("General");
        psicologo.setNumColegiatura("32541");
        
        result = dao.psicologoSet(psicologo);
        System.out.println(result);
    }
}
