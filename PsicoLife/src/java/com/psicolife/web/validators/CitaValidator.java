
package com.psicolife.web.validators;

import com.psicolife.dao.imp.DaoCitaImp;
import com.psicolife.dao.imp.DaoPacienteImp;
import com.psicolife.dao.imp.DaoTipoCitaImp;
import com.psicolife.dao.interfaces.DaoCita;
import com.psicolife.dao.interfaces.DaoPaciente;
import com.psicolife.dao.interfaces.DaoTipoCita;
import com.psicolife.model.Cita;
import com.psicolife.model.Paciente;
import jakarta.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Denni
 */
public class CitaValidator {
    HttpServletRequest request;
    DaoCita citaDao;
    DaoTipoCita terapiaDao;
    DaoPaciente pacienteDao;
    
    public CitaValidator (HttpServletRequest request){
        
        this.request = request;
        this.citaDao = new DaoCitaImp();
        this.pacienteDao = new DaoPacienteImp();
        this.terapiaDao = new DaoTipoCitaImp();
        
    }
    
    public String registrarCita(){
        String result = null;
        
        Timestamp tiempo = Timestamp.valueOf(request.getParameter("fecha"));
        int terapia = Integer.valueOf(request.getParameter("terapia"));
        int pacienteId = Integer.valueOf(request.getParameter("pacienteId"));
        
        Cita cita = new Cita();
        
        cita.setFechaHora(tiempo);
        cita.setIdTipoCita(terapia);
        cita.setIdPaciente(pacienteId);
        
        result = citaDao.citaSet(cita);
        
        result = (result==null) ? "Cita registrada exitosamente." : result;
        
        return result;
    }
    
    public String generarCita(){
        String result = null;
        
        Cita cita = new Cita();
        Paciente paciente = new Paciente();
        
        paciente.setNombre(request.getParameter("nombrePaciente"));
        paciente.setEdad(Integer.valueOf(request.getParameter("edadPaciente")));
        paciente.setParentesco(request.getParameter("parentescoPaciente"));
        paciente.setIdUsuario(Integer.valueOf(request.getParameter("userID")));
        
        result = pacienteDao.pacienteSet(paciente);
        
        String inputDate = request.getParameter("fecha");
        
        // Define un formateador para la fecha de entrada
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        
        // Parsea la fecha de entrada en un objeto LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(inputDate, inputFormatter);
        
        // Define un formateador para el formato deseado
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Formatea la fecha en el formato deseado
        String formattedDate = localDateTime.format(outputFormatter);
        
        cita.setTipoCita(terapiaDao.tipoCitaGet(Integer.valueOf(request.getParameter("terapia"))));
        cita.setFechaHora(Timestamp.valueOf(formattedDate));
        cita.setPaciente(pacienteDao.pacienteGet(pacienteDao.pacienteGetNewId(Integer.valueOf(request.getParameter("userID")), request.getParameter("nombrePaciente"))));
        
        request.setAttribute("cita", cita);
        
        return result;
    }
}
