/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorators;

import clases.ServicioLimpieza;

/**
 *
 * @author alesw31
 */
public abstract class ServicioAdicional extends ServicioLimpieza{
    protected ServicioLimpieza servicio;

    public ServicioAdicional(ServicioLimpieza servicio) {
        super(servicio.direccionCliente, servicio.duracionHoras, servicio.tarifaHoras, servicio.incluyeMateriales, servicio.nombreCliente);
        this.servicio = servicio;
    }

   
 
}
