/*
 * Servicio.java
 */
package datos;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author Equipo4
 */
public class Servicio {

    private String nombre;
    private List<Protocolo> protocolos;
    private List<Cuenta> cuentas;

    public Servicio(String nombre) {
        this.nombre = nombre;
        protocolos = new LinkedList<>();
        cuentas = new LinkedList<>();
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarProtocolo(Protocolo protocolo) {
        if (!protocolos.contains(protocolo)) {
            protocolos.add(protocolo);
            return true;
        }
        return false;
    }

    public boolean agregarCuenta(Cuenta cuenta) {
        if (!cuentas.contains(cuenta)) {
            if (cuenta.getDireccion().toLowerCase().contains(nombre.toLowerCase())) {
                cuentas.add(cuenta);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicio other = (Servicio) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

}
