/*
 * ILectorConfiguracion.java
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import datos.Configuracion;

/**
 * @author Equipo 4
 */
public interface ILectorConfiguracion {

    /**
     * Obtiene una configuracion
     *
     * @return regresa una configuración
     */
    public Configuracion obtenerConfiguracion();
}
