/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.arquitectura.mailSender.consultarConfiguracion;

import datos.Configuracion;

/**
 *
 * @author Equipo 4
 */
public class ConsultarConfiguracion implements IConsultarConfiguracion{

    private ConsultadorConfiguracion consultadorConfiguracion;

    public ConsultarConfiguracion() {
        consultadorConfiguracion = new ConsultadorConfiguracion();
    }
    
    @Override
    public Configuracion consultarConfiguracion() {
        return consultadorConfiguracion.consultar();
    }
    
}
