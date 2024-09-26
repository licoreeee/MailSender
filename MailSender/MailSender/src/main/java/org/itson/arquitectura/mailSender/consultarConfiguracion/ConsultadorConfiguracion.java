/*
 * ConsultadorConfiguracion.java
 */
package org.itson.arquitectura.mailSender.consultarConfiguracion;

import datos.Configuracion;
import org.itson.arquitectura.mailSender.configurarComponente.ILectorConfiguracion;
import org.itson.arquitectura.mailSender.configurarComponente.LectorConfiguracion;

/**
 * Clase que se encarga de consultar la configuración del componente cargado.
 *
 * @author Equipo 4
 */
public class ConsultadorConfiguracion {

    private ILectorConfiguracion lectorConfiguracion;

    /**
     * Constructor que inicializa el atributo lectorConfiguración.
     */
    public ConsultadorConfiguracion() {
        lectorConfiguracion = new LectorConfiguracion();
    }

    /**
     * Método que le habla a la clase que lee la configuración que se usará en el componente.
     * @return Configuración del componente.
     */
    public Configuracion consultar() {
        return lectorConfiguracion.obtenerConfiguracion();
    }
}
