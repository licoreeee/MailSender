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

    /**
     * Constructor que recibe el destinatario, el encabezado y el mensaje del
     * correo.
     *
     * @param destinatario El destinatario del correo
     * @param encabezado El encabezado del correo
     * @param mensaje El mensaje del correo
     */
    public Correo(String destinatario, String encabezado, String mensaje) {
        this.destinatario = destinatario;
        this.encabezado = encabezado;
        this.mensaje = mensaje;
    }

    /**
     * Permite obtener el encabezado del correo.
     *
     * @return El encabezado del correo
     */
    public String getEncabezado() {
        return encabezado;
    }

    /**
     * Permite obtener el mensaje del correo.
     *
     * @return El mensaje del correo
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Permite obtener el destinatario del correo.
     *
     * @return El destinatario del correo
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Permite saber si un correo es correcto o no.
     *
     * @return true si el correo es correcto, false en caso contrario
     */
    public boolean validar() {
        if (encabezado.isBlank()) {
            return false;
        } else if (mensaje.isBlank()) {
            return false;
        } else if (destinatario.isBlank()) {
            return false;
        } else if (!destinatario.matches("^\\w+([.-]?\\w+)@\\w+([.-]?\\w+)(.\\w{2,4})+$")) {
            return false;
        }
        return true;
    }

}
