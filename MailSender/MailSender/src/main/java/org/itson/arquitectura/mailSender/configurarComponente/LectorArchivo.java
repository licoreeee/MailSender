/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 *
 * @author Abe
 */
public class LectorArchivo implements ILector {
    
    
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
        String tipoActual = null; // Protocolo o Cuenta
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
                }
                // Detecta la sección de protocolos o cuentas
                else if (linea.contains("protocolo:")) {
                    tipoActual = "protocolo"; // Indica que lo que sigue son protocolos
                }
                else if (linea.contains("cuenta:")) {
                    tipoActual = "cuenta"; // Indica que lo que sigue son cuentas
                }
                // Detecta y agrega los protocolos o las cuentas
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
