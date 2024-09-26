/*
 * Cuenta.java
 */
package datos;

import java.util.Objects;

/**
 * @author Equipo4
 */
public class Cuenta {

    private String direccion;

    /**
     * Constructor que recibe la dirección de correo de la cuenta.
     *
     * @param direccion La dirección de correo de la cuenta
     */
    public Cuenta(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Permite obtener la dirección de correo de la cuenta.
     *
     * @return La dirección de correo de la cuenta
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Permite asignarle y obtener un hashcode a la cuenta.
     *
     * @return El hashcode asignado a la cuenta
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    /**
     * Permite sabe si la cuenta es igual a otra cuenta.
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
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
    public String toString() {
        return getDireccion();
    }
    
}
