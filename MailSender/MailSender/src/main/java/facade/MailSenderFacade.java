/*
 * MailSenderFacade.java
 */
package facade;

import datos.Configuracion;
import datos.Correo;
import org.itson.arquitectura.mailSender.consultarConfiguracion.ConsultadorConfiguracion;
import org.itson.arquitectura.mailSender.enviarCorreo.EnviadorCorreo;

/**
 * @author Equipo 4
 */
public class MailSenderFacade implements IMailSender {
    
    private EnviadorCorreo enviadorCorreo;
    private ConsultadorConfiguracion consultadorConfiguracion;
    
    /**
     * Constructor.
     */
    public MailSenderFacade(){
        enviadorCorreo = new EnviadorCorreo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void enviarCorreo(Correo correo, Configuracion configuracion) {
        enviadorCorreo.enviar(correo, configuracion);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Configuracion consultarConfiguracion() {
        return consultadorConfiguracion.consultar();
    }
}
