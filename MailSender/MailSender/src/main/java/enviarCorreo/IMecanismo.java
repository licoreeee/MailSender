/*
 * IMecanismo.java
 */
package enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo4
 */
public interface IMecanismo {

    public void enviar(Correo correo, Configuracion configuracion);
    
}
