package com.psicolife.dao.interfaces;

import com.psicolife.model.Cita;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoCita {
    List<Cita> citaSel();//SELECT * FROM
    Cita citaGet(Integer id);//SELECT * FROM WHERE
    List<Cita> listarCitasUsuario(Integer userID);//SELECT * FROM WHERE mascotaID=userID 
    String citaSet (Cita cita); //INSERT
    String citaUpd (Cita cita); //UPDATE
    String citaDel (Integer id); //DELETE
    Cita citaVerificar(Timestamp fecha);//SELECT * FROM WHERE
    String getMensaje ();
}
