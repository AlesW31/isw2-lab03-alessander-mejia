/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import clases.ServicioIndustrial;
import clases.ServicioLimpieza;
import factory.ServicioFactory;

/**
 *
 * @author alesw31
 */
public class IndustrialFactory implements ServicioFactory {

    @Override
    public ServicioLimpieza crearServicio(boolean esApartamento, double multiplicadorRiesgo, int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        return new ServicioIndustrial(multiplicadorRiesgo,direccionCliente,duracionHoras,tarifaHoras,incluyeMateriales,nombreCliente);
    }
    
}
