/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03;

import clases.*;
import decorators.*;
import factory.*;
import solid.*;
        
/**
 *
 * @author alesw31
 */
public class Lab03 {

    public static void main(String[] args) {
        //EJERCICIO 01
        ServicioLimpieza s1 = new ServicioHogar(true,"calle Ariel Ernesto 69", 20, 5,true,"Fantino");
        System.out.println("Precio final del servicio de limpieza: "+ s1.calcularPrecioFinal());
        
        ServicioLimpieza s2 = new ServicioIndustrial(2,"calle Ariel Ernesto 69", 20, 5,true,"Joaquin");
        System.out.println("Precio final del servicio de limpieza: "+s2.calcularPrecioFinal());
        
        ServicioLimpieza s3 = new ServicioOficina(10,"calle Ariel Ernesto 69", 20, 5,true,"Andre");
        System.out.println("Precio final del servicio de limpieza: "+s3.calcularPrecioFinal());
        
        System.out.println("----------------");
        //EJERCICIO02
        
        DescuentoCampania dC = new DescuentoCampania();
        DescuentoClienteFrecuente dF = new DescuentoClienteFrecuente();
        System.out.println("Monto final del servicio Industrial con descuento por campaña: "+ dC.aplicarDescuento(s2.calcularPrecioFinal()) );
        System.out.println("Monto final del servicio Oficina con descuento por cliente frecuente: "+ dF.aplicarDescuento(s3.calcularPrecioFinal()) );
        
        System.out.println("----------------");
        
        //EJERCICIO03
        s1 = new ConAromatizante(s1);
        s1 = new ConDesinfeccion(s1);
        System.out.println("El precio final con los servicios adicionales para el hogar es: "+ s1.calcularPrecioFinal());
        
        //EJERCICIO04
        ServicioFactory f1 = new OficinaFactory();
        ServicioLimpieza oF = f1.crearServicio(true,2,10,"calle Ariel Ernesto 69", 20, 5,true,"Andre");
        System.out.println("Caracteristicas del cliente: \n"+ "Direccion: "+ oF.direccionCliente + "\n"+"Nombre: " + oF.nombreCliente + "\n"+"Monto final: " + oF.calcularPrecioFinal());
    }
}
