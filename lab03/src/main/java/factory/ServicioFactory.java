/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import clases.ServicioLimpieza;

/**
 *
 * @author alesw31
 */
public interface ServicioFactory {
    
    public ServicioLimpieza crearServicio(boolean esApartamento,double multiplicadorRiesgo,int cantidadEmpleados,String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente);
    
}
