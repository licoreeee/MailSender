/*
 * MailgunAPI.java
 */
package org.itson.arquitectura.mailSender.enviarCorreo;

import datos.Configuracion;
import datos.Correo;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;

/**
 *
 * @author Equipo 4
 */
public class MailgunAPI implements IMecanismo {

    @Override
    public void enviar(Correo correo, Configuracion configuracion) {
        Servicio servicio = configuracion.getServicios().getFirst();
        Protocolo protocolo = servicio.getProtocolos().getFirst();
        Cuenta cuenta = servicio.getCuentas().getFirst();
        System.out.printf("""
                          Correo enviado exitosamente.
                          Mecanismo: Mailgun.API
                          Servicio: %s
                          Protocolo: %s
                          Cuenta: %s
                          """, servicio.getNombre(), protocolo.getNombre(), cuenta.getDireccion());
    }
    
}
