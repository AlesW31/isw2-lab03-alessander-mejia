/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alesw31
 */
public abstract class ServicioLimpieza {
    public String direccionCliente;
    public double duracionHoras;
    public double tarifaHoras;
    public boolean incluyeMateriales;
    public String nombreCliente;

    public ServicioLimpieza(String direccionCliente, double duracionHoras, double tarifaHoras, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHoras = tarifaHoras;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }
    
    public double calcularPrecioBase(){
        return duracionHoras * tarifaHoras;
    }
    
    public abstract double calcularPrecioFinal();
}
