/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorators;

import clases.ServicioLimpieza;
import decorators.ServicioAdicional;

/**
 *
 * @author alesw31
 */
public class ConDesinfeccion extends ServicioAdicional {

    public ConDesinfeccion(ServicioLimpieza servicio) {
        super(servicio);
    }



    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal()+15.0;
    }
    
}
