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
        private final String regexCorreo = "^([\\w\\d./_-]+)([@]{1})([\\w]+)([.]{1}[\\w]+)+$"; // Regex para un correo electronico (w@s.c)
        private final String regexNumCelular = "(^9{1}\\d{8}$)"; //Regex para un numero de celular (9[0...9]{8})
        
        
        public boolean revisarCorreo(String correo){
            // Crear un objeto Pattern
            Pattern patronCorreo = Pattern.compile(regexCorreo);
            Pattern patronNumero = Pattern.compile(regexNumCelular);
            // Crear un objeto Matcher
            Matcher matcherCorreo = patronCorreo.matcher(correo);
            Matcher matcherNumCelular = patronNumero.matcher(correo);
            boolean valor = false;
            // Buscar coincidencias en el texto
            if(matcherCorreo.find()) {
                valor = true;        
            }
            return valor;
        }
        
        public boolean revisarNumero (String numero){
            // Crear un objeto Pattern
            Pattern patronNumero = Pattern.compile(regexNumCelular);
            // Crear un objeto Matcher
            Matcher matcherNumCelular = patronNumero.matcher(numero);
            boolean valor = false;
            // Buscar coincidencias en el texto
            if(matcherNumCelular.find()) {
                valor = true;        
            }
            return valor;
        }
}
