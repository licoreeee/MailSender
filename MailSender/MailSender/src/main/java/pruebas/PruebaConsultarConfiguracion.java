/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import datos.Configuracion;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;
import java.util.List;
import org.itson.arquitectura.mailSender.consultarConfiguracion.ConsultarConfiguracion;
import org.itson.arquitectura.mailSender.consultarConfiguracion.IConsultarConfiguracion;

/**
 *
 * @author Equipo 4
 */
public class PruebaConsultarConfiguracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IConsultarConfiguracion cc = new ConsultarConfiguracion();
        
        Configuracion config = cc.consultarConfiguracion();
        
        List<Servicio> serviciosConfig = config.getServicios();
        for (Servicio servicio : serviciosConfig) {
            System.out.println("Servicio: "+servicio.getNombre());
            for (Protocolo protocolo : servicio.getProtocolos()) {
                System.out.println("     Protocolo:"+protocolo.getProtocolo());
            }
            for (Cuenta cuenta : servicio.getCuentas()) {
                System.out.println("     Cuentas:"+cuenta.getDireccion());
            }
        }
    }
    
}
