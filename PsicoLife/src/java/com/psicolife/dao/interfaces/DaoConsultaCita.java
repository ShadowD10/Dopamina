/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.psicolife.dao.interfaces;

import com.psicolife.model.ConsultaCita;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoConsultaCita {
    List<ConsultaCita> consultaCitaSel(); //SELECT * FROM
    List<ConsultaCita> consultaCitaGet(int idUsuario); //SELECT * FROM WHERE
    String getMensaje();
}
