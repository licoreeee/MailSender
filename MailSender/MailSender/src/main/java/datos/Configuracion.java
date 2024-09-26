/*
 * Configuracion.java
 */
package datos;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Equipo4
 */
public class Configuracion {

    private List<Servicio> servicios;

    public Configuracion() {
        servicios = new LinkedList<>();
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public boolean agregarServicio(Servicio servicio) {
        if (!servicios.contains(servicio)) {
            servicios.add(servicio);
            return true;
        }
        return false;
    }

    public boolean validar() {
        if (servicios.isEmpty()) {
            return false;
        } 
        return true;
    }
}
