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

    public void enviarCorreo(Correo correo, Configuracion configuracion);
    
    public Configuracion configurarComponente();
    
    public Configuracion consultarConfiguracion();
    
}
