package com.psicolife.dao.interfaces;

import com.psicolife.model.TipoCita;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoTipoCita {
    List<TipoCita> tipoCitaSel(); //SELECT * FROM
    TipoCita tipoCitaGet(Integer id); //SELECT * FROM WHERE
    TipoCita tipoCitaUserGet(Integer idUser); //SELECT * FROM WHERE
    String tipoCitaSet(TipoCita tipoCita); //INSERT 
    String tipoCitaUpd(TipoCita tipoCita); //UPDATE
    String tipoCitaDel(Integer id); //DELETE
    String getMensaje();
}
