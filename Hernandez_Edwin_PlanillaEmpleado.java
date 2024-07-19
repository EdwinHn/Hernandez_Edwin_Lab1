/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_planillaempleado;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_PlanillaEmpleado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        //Declaración de variables
        String nombre;
        double horasMensual;
        double tarifaXhora;
        double salarioSemanal;

        //Ingreso de datos
        System.out.print("Ingrese su nombre completo: ");
        nombre = scan.next();
        System.out.print("Ingrese sus horas de trabajo mensual: ");
        horasMensual = scan.nextDouble();
        System.out.print("Ingrese sus horas de tarifa por hora: ");
        tarifaXhora = scan.nextDouble();

        System.out.println();

        //Cálculo de salario mensual
        salarioSemanal = (horasMensual / 4) * tarifaXhora;

        //Impresión de resultados
        System.out.println("**** BOLETA DE EMPLEADO ****");
        System.out.println();
        System.out.println("Nombre de empleado: " + nombre);
        System.out.println("Horas de trabajo mensual: " + horasMensual);
        System.out.println("Tarifa por hora: Lps." + tarifaXhora);
        System.out.println("Salario del empleado semanal: Lps." + salarioSemanal);
    }
}
