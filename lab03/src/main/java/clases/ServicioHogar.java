/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public class ServicioHogar extends ServicioLimpieza{
    private boolean esApartamento;

    public ServicioHogar(boolean esApartamento, String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHoras, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }



    @Override
    public double calcularPrecioFinal() {
        double precioBase = calcularPrecioBase();
        if (esApartamento) {
            precioBase = precioBase * 0.9;
        }
        return precioBase;
    }
    
}
