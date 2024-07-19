/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_clics;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Clics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        //Declaración de variables
        int clicsTotal;

        int clics1;
        int clics2;
        int clics3;

        double precioClics1;
        double precioClics2;
        double precioClics3;

        double totalClics1;
        double totalClics2;
        double totalClics3;

        double totalPrecioClics;

        double ISV = 0.16;

        double promedio;

        //Ingreso de datos
        System.out.println("**** CLICS ****");
        System.out.println();
        System.out.print("Ingrese la cantidad total de clics: ");
        clicsTotal = scan.nextInt();

        System.out.print("Ingrese la primera cantidad de clics: ");
        clics1 = scan.nextInt();
        System.out.print("Ingrese el precio de la primera cantidad de clics: $");
        precioClics1 = scan.nextDouble();
        System.out.println("");

        System.out.print("Ingrese la segunda cantidad de clics: ");
        clics2 = scan.nextInt();
        System.out.print("Ingrese el precio de la primera cantidad de clics: $");
        precioClics2 = scan.nextDouble();
        System.out.println("");

        System.out.print("Ingrese la tercera cantidad de clics: ");
        clics3 = scan.nextInt();
        System.out.print("Ingrese el precio de la primera cantidad de clics: $");
        precioClics3 = scan.nextDouble();
        System.out.println("");

        //Cálculo e impresión de resultados;
        totalClics1 = clics1 * precioClics1;
        totalClics2 = clics2 * precioClics2;
        totalClics3 = clics3 * precioClics3;

        totalPrecioClics = totalClics1 + totalClics2 + totalClics3;
        promedio = (totalPrecioClics/clicsTotal)+ISV;
        
        System.out.println("ISV 16%");
        System.out.println("Promedio: $"+promedio);
    }
}
