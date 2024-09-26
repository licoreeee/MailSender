/*
 * EnviadorCorreo.java
 */
package enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 * @author Equipo4
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
