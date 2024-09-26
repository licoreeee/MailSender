/*
 * MailSenderFacade.java
 */
package facade;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo 4
 */
public class MailSenderFacade implements IMailSender {

    @Override
    public void enviarCorreo(Correo correo, Configuracion configuracion) {
        
    }

    @Override
    public Configuracion configurarComponente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Configuracion consultarConfiguracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
