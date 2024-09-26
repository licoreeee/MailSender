/*
 * Servicio.java
 */
package datos;

import java.util.List;

/**
 * @author Equipo4
 */
public class Servicio {

    private String nombre;
    private List<Protocolo> protocolos;
    private List<Cuenta> cuentas;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    public List<Protocolo> getProtocolos() {
        return protocolos;
    }

    public void setProtocolos(List<Protocolo> protocolos) {
        this.protocolos = protocolos;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregarProtocolo(Protocolo protocolo) {
        protocolos.add(protocolo);
    }

    public boolean agregarCuenta(Cuenta cuenta) {
        if (cuenta.getDireccion().toLowerCase().contains(nombre.toLowerCase())) {
            cuentas.add(cuenta);
            return true;
        } else {
            return false;
        }
    }

}
