/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    public boolean validar(){
        return true;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

}
