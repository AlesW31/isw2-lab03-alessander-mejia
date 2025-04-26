/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public class ServicioIndustrial extends ServicioLimpieza {
    private double multiplicadorRiesgo;

    public ServicioIndustrial(double multiplicadorRiesgo, String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHoras, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public double calcularPrecioFinal() {
        if (!incluyeMateriales) {
            throw new IllegalArgumentException("Los servicios industriales deben incluir materiales æa");
        }
        double precioBase = calcularPrecioBase();
        return precioBase*multiplicadorRiesgo;
    }
}
