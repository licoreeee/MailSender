/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import datos.Configuracion;
import datos.Correo;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;
import org.itson.arquitectura.mailSender.enviarCorreo.IMecanismo;
import implementaciones.JavaMailApi;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Abe
 */
public class PruebaEnviarCorreos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IMecanismo mecanismo = new JavaMailApi();
        Configuracion configuracion = new Configuracion();
        
        List<Servicio> servicios = new LinkedList<>();
        servicios.add(new Servicio("POTROS"));
        List<Protocolo> protocolos = new LinkedList<>();
        protocolos.add(new Protocolo("POP3"));
        List<Cuenta> cuentas = new LinkedList<>();
        cuentas.add(new Cuenta("equipo4.arquitectura@gmail.com"));
        
        servicios.getFirst().setProtocolos(protocolos);
        servicios.getFirst().setCuentas(cuentas);
        configuracion.setServicios(servicios);
        
        

        Correo correo = new Correo();
        correo.setDestinatario("abel.sanchez245473@potros.itson.edu.mx");
        correo.setEncabezado("Puro hola mundo");
        correo.setMensaje("Hola mundo lo mejor);
        mecanismo.enviar(correo, configuracion);
    }
    
}
