/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.psicolife.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Denni
 */
public class Regex {
        // Definir expresiones regular
        private final String regexCorreo = "^([\\w\\d./_-]+)([@]{1})([\\w]+)([.]{1}[\\w]+)+"; // Regex para un correo electronico (w@s.c)
       
        public boolean revisarCorreo(String correo){
        // Crear un objeto Pattern
        Pattern pattern = Pattern.compile(regexCorreo);
        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(correo);
        boolean valor = false;
        // Buscar coincidencias en el texto
        if(matcher.find()) {
            valor = true;        
        }
        return valor;
        }
}
