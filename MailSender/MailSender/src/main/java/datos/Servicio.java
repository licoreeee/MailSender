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

    /**
     * Constructor que recibe el nombre del servicio.
     *
     * @param nombre El nombre del servicio
     */
    public Servicio(String nombre) {
        this.nombre = nombre;
        protocolos = new LinkedList<>();
        cuentas = new LinkedList<>();
    }

    /**
     * Permite obtener los protocolos disponibles para el servicio.
     *
     * @return Los protocolos disponibles
     */
    public List<Protocolo> getProtocolos() {
        return protocolos;
    }

    /**
     * Permite establecer los protocolos disponibles para el servicio.
     *
     * @param protocolos Los protocolos disponibles
     */
    public void setProtocolos(List<Protocolo> protocolos) {
        this.protocolos = protocolos;
    }

    /**
     * Permite obtener las cuentas disponibles para el servicio.
     *
     * @return Las cuentas disponibles
     */
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Permite establecer las cuentas disponibles para el servicio.
     *
     * @param cuentas Las cuentas disponibles
     */
    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Permite obtener el nombre del servicio.
     *
     * @return El nombre del servicio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite agregar un protocolo al servicio siempre y cuando este no se
     * encuentre ya en el servicio.
     *
     * @param protocolo El protocolo a agregar
     * @return true si se agregó el protocolo, false en caso contrario
     */
    public boolean agregarProtocolo(Protocolo protocolo) {
        if (!protocolos.contains(protocolo)) {
            protocolos.add(protocolo);
            return true;
        }
        return false;
    }

    /**
     * Permite agregar una cuenta al servicio siempre y cuando esta no se
     * encuentre ya en el servicio.
     *
     * @param cuenta La cuenta a agregar
     * @return true si se agregó la cuenta, false en caso contrario
     */
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

    /**
     * Permite asignarle y obtener un hashcode a la cuenta.
     *
     * @return El hashcode de la cuenta
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /**
     * Permite saber si la cuenta es igual a otra cuenta.
     *
     * @param obj La otra cuenta
     * @return true si las cuentas son iguales, false en caso contrario
     */
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
