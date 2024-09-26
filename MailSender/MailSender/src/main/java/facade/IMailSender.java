/*
 * IMailSender.java
 */
package facade;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo4
 */
public interface IMailSender {

    /**
     * Permite enviar un correo con una configuración específica.
     *
     * @param correo El correo a enviar
     * @param configuracion La configuración con la que se enviará el correo
     */
    public void enviarCorreo(Correo correo, Configuracion configuracion);

    /**
     * Permite consultar las configuraciones disponibles.
     *
     * @return Las configuraciones disponibles
     */
    public Configuracion consultarConfiguracion();

}
