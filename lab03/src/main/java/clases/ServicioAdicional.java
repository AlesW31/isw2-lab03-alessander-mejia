/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public abstract class ServicioAdicional extends ServicioLimpieza{
    
    public ServicioAdicional(String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHoras, incluyeMateriales, nombreCliente);
    }

    @Override
    public abstract double calcularPrecioFinal();
    
    public abstract String getDescripcion();
    
}
