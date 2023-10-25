package com.psicolife.dao.interfaces;

import com.psicolife.model.Paciente;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoPaciente {
    List<Paciente> pacienteSel(); //SELECT * FROM
    Paciente pacienteGet(Integer id); //SELECT * FROM WHERE
    List<Paciente> pacienteUserGet(Integer idUser); //SELECT * FROM WHERE
    String pacienteSet(Paciente paciente); //INSERT 
    String pacienteUpd(Paciente paciente); //UPDATE
    String pacienteDel(Integer id); //DELETE
    String getMensaje(); 
}
