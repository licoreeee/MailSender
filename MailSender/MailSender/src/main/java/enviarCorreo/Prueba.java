/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enviarCorreo;

import datos.Configuracion;
import datos.Correo;

/**
 *
 * @author Abe
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IMecanismo mecanismo = new JavaMailSender();
        Configuracion configuracion = new Configuracion();
        Correo correo = new Correo();
        correo.setDestinatario("diego.valenzuela247700@potros.itson.edu.mx");
        correo.setEncabezado("Puro hola mundo");
        correo.setMensaje("Hola mundo la mejor planilla alvvvvvvv!!!!!");
        mecanismo.enviar(correo, configuracion);
    }
    
}
