/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Abe
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar el lector
        ILector lector = new LectorArchivo();

        Map<String, Map<String, List<String>>> servicios = lector.leerConfiguracion();

        System.out.println("# Configuración de servicios y protocolos");
        for (String servicio : servicios.keySet()) {
            System.out.println(servicio + ":");
            Map<String, List<String>> datos = servicios.get(servicio);

            System.out.println("     protocolo:");
            for (String protocolo : datos.get("protocolo")) {
                System.out.println("          -" + protocolo);
            }

            System.out.println("     cuenta:");
            for (String cuenta : datos.get("cuenta")) {
                System.out.println("          -" + cuenta);
            }
        }
    }
    
}
