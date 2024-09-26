/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Abe
 */
public interface ILector {
    public Map<String, Map<String, List<String>>> leerConfiguracion();
        
}
