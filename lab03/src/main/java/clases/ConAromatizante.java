/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public class ConAromatizante extends ServicioAdicional {
    protected ServicioAdicional servicio;

    public ConAromatizante(String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHoras, incluyeMateriales, nombreCliente);
    }

    @Override
    public double calcularPrecioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDescripcion() {
        return servic
    }
    
}
