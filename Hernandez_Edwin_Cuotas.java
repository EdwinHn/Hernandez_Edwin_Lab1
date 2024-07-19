/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hernandez_edwin_cuotas;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Cuotas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        
        //Declaración de variables
        double valorinicial;
        double plazo;
        double interesMensual;
        double comision;
        double porcentajeSeguro;
        
        double valorCuota;
        double total;
        
        //Ingreso de datos
        System.out.print("- Ingrese el valor original del prestamo: Lps. ");
        valorinicial=scan.nextDouble();
        System.out.print("- Ingrese el plazo de pago establecido (en meses): ");
        plazo=scan.nextDouble();
        System.out.print("- Ingrese el interes mensual aplicado al prestamo: %");
        interesMensual=scan.nextDouble();
        System.out.print("- Ingrese la comision por cuota: %");
        comision=scan.nextDouble();
        System.out.print("- Ingrese el porcentaje de seguro mensual aplicado a la cuota: %");
        porcentajeSeguro=scan.nextDouble();
        
        //Cálculo e impresión de resultados
        interesMensual=interesMensual/100;
        porcentajeSeguro=porcentajeSeguro/100;
        comision=comision/100;
        
        double interesMensualLPS=interesMensual*valorinicial;
        double cuotaBase= (valorinicial+(interesMensualLPS*plazo))/plazo;
        double cuotaSeguro= cuotaBase*porcentajeSeguro;
        valorCuota= cuotaBase+comision+cuotaSeguro;
        total= valorCuota*plazo;
        
        
        System.out.println("");
        System.out.println("**** CUOTAS MENSUALES ****");
        System.out.println("Cuota de Pago Mensual: Lps."+valorCuota);
        System.out.println("Total a Pagar: Lps."+total);
        
    }
}
