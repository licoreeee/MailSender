/*
 * Protocolo.java
 */
package datos;

import java.util.Objects;

/**
 * @author Equipo4
 */
public class Protocolo {

    private String protocolo;

    public Protocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.protocolo);
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
        final Protocolo other = (Protocolo) obj;
        return Objects.equals(this.protocolo, other.protocolo);
    }

}
