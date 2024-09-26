/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import datos.Configuracion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Abe
 */
public class LectorConfiguracion implements ILectorConfiguracion{

    @Override
    public Configuracion obtenerConfiguracion() {

       ILector lector = new LectorArchivo(); 
       
        Map<String, Map<String, List<String>>> servicios = lector.leerConfiguracion();
        
        for (String servicio : servicios.keySet()) {
            Map<String, List<String>> datos = servicios.get(servicio);
            
            for (String protocolo : datos.get("protocolo")) {
                System.out.println("          -" + protocolo);
            }

            System.out.println("     cuenta:");
            for (String cuenta : datos.get("cuenta")) {
                System.out.println("          -" + cuenta);
            }
        }
        return new Configuracion();
    }
    
}
