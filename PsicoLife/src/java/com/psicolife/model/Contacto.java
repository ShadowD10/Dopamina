
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
    private String mensaje;
    private String numCelular;
    private Timestamp fechaHora;

    public Contacto() {
    }

    public Contacto(int id, String nombre, String correo, String mensaje, String numCelular, Timestamp fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
        this.numCelular = numCelular;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
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
