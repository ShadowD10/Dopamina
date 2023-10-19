/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.psicolife.dao.interfaces;

import com.psicolife.model.Psicologo;
import java.util.List;

/**
 *
 * @author JESUSUEMY
 */
public interface DaoPsicologo {
    List<Psicologo> psicologoSel(); //SELECT * FROM
    Psicologo psicologoGet(Integer id); //SELECT * FROM WHERE
    String psicologoSet(Psicologo psicologo); //INSERT 
    String psicologoUpd(Psicologo psicologo); //UPDATE
    String psicologoDel(Integer id); //DELETE
    String getMensaje();     
}
