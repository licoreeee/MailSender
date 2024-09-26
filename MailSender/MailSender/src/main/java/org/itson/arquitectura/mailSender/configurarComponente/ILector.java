/*
 * ILector.java
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import java.util.List;
import java.util.Map;

/**
 * @author Equipo 4
 */
public interface ILector {

    /**
     * Permite obtener los valores de una configuración
     *
     * @return mapa con valores de configuracion
     */
    public Map<String, Map<String, List<String>>> leerConfiguracion();

}
