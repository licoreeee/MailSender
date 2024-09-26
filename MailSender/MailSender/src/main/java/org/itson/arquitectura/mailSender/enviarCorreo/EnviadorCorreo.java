/*
 * EnviadorCorreo.java
 */
package org.itson.arquitectura.mailSender.enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo 4
 */
public class EnviadorCorreo {

    private IMecanismo mecanismo;

    /**
     * Constructor.
     */
    public EnviadorCorreo() {
        this.mecanismo = new JavaMailApi();
    }

    /**
     * Permite enviar un correo con una configuración especifica.
     *
     * @param correo El correo a enviar.
     * @param configuracion La configuración a usar para enviar el correo
     */
    public void enviar(Correo correo, Configuracion configuracion) {
        if (correo.validar() && configuracion.validar()) {
            mecanismo.enviar(correo, configuracion);
        }
    }

}
