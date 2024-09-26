/*
 * IMecanismo.java
 */
package org.itson.arquitectura.mailSender.enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo 4
 */
public interface IMecanismo {

    public void enviar(Correo correo, Configuracion configuracion);

}
