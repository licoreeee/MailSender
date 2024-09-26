/*
 * Protocolo.java
 */
package datos;

import java.util.Objects;

/**
 * @author Equipo4
 */
public class Protocolo {

    private String nombre;

    /**
     * Constructor que recibe el nombre del protocolo.
     *
     * @param nombre El nombre del protocolo
     */
    public Protocolo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el nombre del protocolo.
     *
     * @return El nombre del protocolo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignarle y obtener un hashcode al protocolo.
     *
     * @return EL hashcode del protocolo
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /**
     * Permite sabe si el protocolo es igual a otro protocolo.
     *
     * @param obj El otro protocolo
     * @return true si los protocolos son iguales, false en caso contrario
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
        final Protocolo other = (Protocolo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

}
