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

    /**
     * Constructor.
     */
    public Configuracion() {
        servicios = new LinkedList<>();
    }

    /**
     * Permite obtener los servicios disponibles en la configuración.
     *
     * @return Los servicios de la configuración
     */
    public List<Servicio> getServicios() {
        return servicios;
    }

    /**
     * Permite establecer una lista de servicios para la configuración.
     *
     * @param servicios Los servicios de la configuración.
     */
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    /**
     * Permite agregar un servicio a la configuración, siempre y cuando el
     * servicio no se encuentre ya en la configuración.
     *
     * @param servicio El servicio a agregar
     * @return true si se pudo agregar, false en caso contrario
     */
    public boolean agregarServicio(Servicio servicio) {
        if (!servicios.contains(servicio)) {
            servicios.add(servicio);
            return true;
        }
        return false;
    }

    /**
     * Permite saber si la configuración es correcta o no.
     *
     * @return true si la configuración es correcta, false en caso contrario
     */
    public boolean validar() {
        if (servicios.isEmpty()) {
            return false;
        }
        return true;
    }
}
