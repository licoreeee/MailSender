/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.mailSender.consultarConfiguracion;

import datos.Configuracion;
import org.itson.arquitectura.mailSender.configurarComponente.ILectorConfiguracion;
import org.itson.arquitectura.mailSender.configurarComponente.LectorConfiguracion;

/**
 *
 * @author Equipo 4
 */
public class ConsultadorConfiguracion {
    
    private ILectorConfiguracion lectorConfiguracion;

    public ConsultadorConfiguracion() {
        lectorConfiguracion = new LectorConfiguracion();
    }

    public Configuracion consultar() {
        return lectorConfiguracion.obtenerConfiguracion();
    }
}