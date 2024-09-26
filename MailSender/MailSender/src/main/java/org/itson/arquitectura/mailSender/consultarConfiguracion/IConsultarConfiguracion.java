/*
 * IConsultarConfiguracion.java
 */
package org.itson.arquitectura.mailSender.consultarConfiguracion;

import datos.Configuracion;

/**
 * Interfaz que define el método necesario para consultar la configuración del
 * componente.
 *
 * @author Equipo 4
 */
public interface IConsultarConfiguracion {

    /**
     * Método para consultar la configuración del componente que previamente se
     * obtuvo de un archivo.
     *
     * @return La configuración del componente.
     */
    public Configuracion consultarConfiguracion();
}
