/*
 * JavaMailSender.java
 */
package enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo4
 */
public class JavaMailSender implements IMecanismo {

    @Override
    public void enviar(Correo correo, Configuracion configuracion) {
        System.out.println("Se envió el correo exitosamente");
    }

}
