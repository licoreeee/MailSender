/*
 * LectorArchivo.java
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Equipo 4
 */
public class LectorArchivo implements ILector {

    /**
     * Lee una configuración guardada en un archivo de tetxto, para ello se
     * guardan los elementos tanto en mapas como lista
     *
     * @return mapa con los valores completos de configuración
     */
    @Override
    public Map<String, Map<String, List<String>>> leerConfiguracion() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("configuracion.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String linea;
        String servicioActual = null;
        String tipoActual = null;
        Map<String, Map<String, List<String>>> servicios = new HashMap<>();

        try {
            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();

                // Detecta los servicios
                if (linea.endsWith(":") && !linea.contains("protocolo") && !linea.contains("cuenta")) {
                    servicioActual = linea.substring(0, linea.length() - 1).trim();
                    servicios.put(servicioActual, new HashMap<>());
                    servicios.get(servicioActual).put("protocolo", new ArrayList<>());
                    servicios.get(servicioActual).put("cuenta", new ArrayList<>());
                } // Detecta la sección de protocolos o cuentas
                else if (linea.contains("protocolo:")) {
                    tipoActual = "protocolo";
                } else if (linea.contains("cuenta:")) {
                    tipoActual = "cuenta";
                } // Detecta y agrega los protocolos o las cuentas
                else if (linea.startsWith("-") && servicioActual != null && tipoActual != null) {
                    String valor = linea.substring(1).trim();
                    servicios.get(servicioActual).get(tipoActual).add(valor);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(LectorArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return servicios;
    }
}
