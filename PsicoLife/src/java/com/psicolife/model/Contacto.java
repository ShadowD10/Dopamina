
package com.psicolife.model;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author Denni 
 */
public class Contacto {
    private int id;
    private String nombre;
    private String correo;
    private String numCelular;
    private String mensaje;
    private Timestamp fechaHora;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String correo, String numCelular, String mensaje, Timestamp fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.numCelular = numCelular;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
    
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    public String getFechaHoraString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String fechaFormateada = sdf.format(this.fechaHora);
        return fechaFormateada;
    }   
    
}
