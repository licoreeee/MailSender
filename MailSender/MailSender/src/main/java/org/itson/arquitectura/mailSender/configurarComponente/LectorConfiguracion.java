/*
 * LectorConfiguracion.java
 */
package org.itson.arquitectura.mailSender.configurarComponente;

import datos.Configuracion;
import datos.Cuenta;
import datos.Protocolo;
import datos.Servicio;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Equipo 4
 */
public class LectorConfiguracion{

    /**
     * obtiene una los valores de una configuración guardada en un mapa y lo
     * tranforma en un objeto de timpo configuración
     *
     * @return valor de la configuración con sus valores
     */
    public Configuracion obtenerConfiguracion() {

        ILector lector = new LectorArchivo();

        Map<String, Map<String, List<String>>> servicios = lector.leerConfiguracion();
        List<Servicio> listaServicios = new LinkedList<>();
        for (String servicioArchivo : servicios.keySet()) {

            List<Protocolo> listaProtocolos = new LinkedList<>();
            List<Cuenta> listaCuentas = new LinkedList<>();
            Map<String, List<String>> datos = servicios.get(servicioArchivo);
            Servicio servicio = new Servicio(servicioArchivo);
            for (String protocoloArchivo : datos.get("protocolo")) {
                Protocolo protocolo = new Protocolo(protocoloArchivo);
                listaProtocolos.add(protocolo);
            }

            for (String cuentaArchivo : datos.get("cuenta")) {
                Cuenta cuenta = new Cuenta(cuentaArchivo);
                listaCuentas.add(cuenta);
            }
            servicio.setCuentas(listaCuentas);
            servicio.setProtocolos(listaProtocolos);
            listaServicios.add(servicio);
        }
        Configuracion configuracion = new Configuracion();
        configuracion.setServicios(listaServicios);

        return configuracion;

    }

}
