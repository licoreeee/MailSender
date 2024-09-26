/*
 * Correo.java
 */
package datos;

/**
 * @author Equipo4
 */
public class Correo {
    
    private String encabezado;
    private String mensaje;
    private String destinatario;

    public Correo() {
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean validar() {
        return true;
    }

}
