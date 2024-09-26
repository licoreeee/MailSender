/*
 * PruebaEnviarCorreo.java
 */
package pruebas;

import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;

/**
 * @author Equipo4
 */
public class PruebaEnviarCorreos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Protocolo pop3 = new Protocolo("Pop3");
        Protocolo imap = new Protocolo("IMAP");
        
        Cuenta cuenta1 = new Cuenta("ricardo.gutierrez@gmail.com");
        Cuenta cuenta2 = new Cuenta("abel.sanchez@gmail.com");
        
        Servicio servicio = new Servicio("GMail");
    }
    
}
