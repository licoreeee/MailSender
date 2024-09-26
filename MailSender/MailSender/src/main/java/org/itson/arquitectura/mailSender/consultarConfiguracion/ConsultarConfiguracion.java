/*
 * ConsultarConfiguracion.java
 */
package org.itson.arquitectura.mailSender.consultarConfiguracion;

import datos.Configuracion;

/**
 * Clase que implementa a IConsultarConfiguración e implementa la funcionalidad
 * de consultar la configuración del componente.
 *
 * @author Equipo 4
 */
public class ConsultarConfiguracion implements IConsultarConfiguracion {

    private ConsultadorConfiguracion consultadorConfiguracion;

    /**
     * Método constructor que inicializa el atributo consultadorConfiguración.
     */
    public ConsultarConfiguracion() {
        consultadorConfiguracion = new ConsultadorConfiguracion();
    }

    /**
     * Método que le habla a la clase que obtiene la configuración del componente.
     * @return La configuración del componente
     */
    @Override
    public Configuracion consultarConfiguracion() {
        return consultadorConfiguracion.consultar();
    }

}
