/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.mailSender.enviarCorreo;

import datos.Configuracion;
import datos.Correo;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;
import facade.IMailSender;
import org.itson.arquitectura.mailSender.enviarCorreo.IMecanismo;

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
                          """, servicio.getNombre(), protocolo.getProtocolo(), cuenta.getDireccion());
    }
    
}
