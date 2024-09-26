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
import java.util.Map;
import org.itson.arquitectura.mailSender.configurarComponente.ILector;
import org.itson.arquitectura.mailSender.configurarComponente.ILectorConfiguracion;
import org.itson.arquitectura.mailSender.configurarComponente.LectorArchivo;
import org.itson.arquitectura.mailSender.configurarComponente.LectorConfiguracion;

/**
 *
 * @author Abe
 */
public class PruebaConfigurarComponente {

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
        
        System.out.println("**********************************************************");
        ILectorConfiguracion lectorConfig = new LectorConfiguracion();
        Configuracion configuracion = lectorConfig.obtenerConfiguracion();
        List<Servicio> serviciosConfig = configuracion.getServicios();        
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
