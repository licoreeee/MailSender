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

    public EnviadorCorreo() {

    }

    public void enviar(Correo correo, Configuracion configuracion) {
        if (correo.validar() && configuracion.validar()) {
            mecanismo.enviar(correo, configuracion);
        }
    }
    
}
