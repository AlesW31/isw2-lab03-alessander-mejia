/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public class ServicioOficina extends ServicioLimpieza{
    private int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHoras, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double horasE = cantidadEmpleados * 0.1;
        double precioF = (duracionHoras + horasE) * tarifaHoras;
        return precioF;
    }
}
