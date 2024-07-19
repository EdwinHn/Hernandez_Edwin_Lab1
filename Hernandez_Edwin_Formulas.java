/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_formulas;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Formulas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        System.out.println("**** FORMULAS ****");
        System.out.println();

        //Formula A
        System.out.println("Formula A");

        //Declaración de variables
        double numerador1A;
        double denominador1A;
        double numerador2A;
        double denominador2A;

        double resultadoA;

        //Ingreso de datos
        System.out.print("Ingrese el numerador 1: ");
        numerador1A = scan.nextDouble();
        System.out.print("Ingrese el denominador 1: ");
        denominador1A = scan.nextDouble();
        System.out.print("Ingrese el numerador 2: ");
        numerador2A = scan.nextDouble();
        System.out.print("Ingrese el denominador 2: ");
        denominador2A = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoA = (numerador1A / denominador1A) + (numerador2A / denominador2A);
        System.out.println("Resultado: " + resultadoA);

        System.out.println("");

        //Formula B
        System.out.println("Formula B");

        //Declaración de variables
        double valorxB;
        double valoryB;

        double resultadoB;

        //Ingreso de datos
        System.out.print("Ingrese el valor de x: ");
        valorxB = scan.nextDouble();
        System.out.print("Ingrese el valor de y: ");
        valoryB = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoB = (1 / (valorxB - 5)) - ((3 * valorxB * valoryB) / 4);
        System.out.println("Resultado: " + resultadoB);

        System.out.println("");

        //Formula C
        System.out.println("Formula C");

        //Declaración de variables
        double numeradorC;
        double denominadorC;
        double numeroSumarC;

        double resultadoC;

        //Ingreso de datos
        System.out.print("Ingrese el numerador 1: ");
        numeradorC = scan.nextDouble();
        System.out.print("Ingrese el denominador 1: ");
        denominadorC = scan.nextDouble();
        System.out.print("Ingrese el número a sumar: ");
        numeroSumarC = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoC = (numeradorC / denominadorC) + numeroSumarC;
        System.out.println("Resultado: " + resultadoC);

        System.out.println("");

        //Formula D
        System.out.println("Formula D");

        //Declaración de variables
        double numeradorD;
        double denominadorD;
        double numeroSumarD;

        double resultadoD;

        //Ingreso de datos
        System.out.print("Ingrese el número a sumar: ");
        numeroSumarD = scan.nextDouble();
        System.out.print("Ingrese el numerador 1: ");
        numeradorD = scan.nextDouble();
        System.out.print("Ingrese el denominador 1: ");
        denominadorD = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoD = numeroSumarD + (numeradorD / denominadorD);
        System.out.println("Resultado: " + resultadoD);

        System.out.println("");

        //Formula E
        System.out.println("Formula E");

        //Declaración de variables
        double valorAE;
        double valorBE;
        double valorCE;
        double valorDE;
        double valorEE;
        double valorFE;
        double valorGE;
        double valorHE;
        double valorJE;

        double resultadoE;

        //Ingreso de datos
        System.out.print("Ingrese el valor de A: ");
        valorAE = scan.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        valorBE = scan.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        valorCE = scan.nextDouble();
        System.out.print("Ingrese el valor de D: ");
        valorDE = scan.nextDouble();
        System.out.print("Ingrese el valor de E: ");
        valorEE = scan.nextDouble();
        System.out.print("Ingrese el valor de F: ");
        valorFE = scan.nextDouble();
        System.out.print("Ingrese el valor de G: ");
        valorGE = scan.nextDouble();
        System.out.print("Ingrese el valor de H: ");
        valorHE = scan.nextDouble();
        System.out.print("Ingrese el valor de J: ");
        valorJE = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoE = ((valorAE * valorAE) / (valorBE - valorCE)) + ((valorDE - valorEE) / (valorFE - ((valorGE * valorHE) / valorJE)));
        System.out.println("Resultado: " + resultadoE);

        System.out.println("");

        //Formula F
        System.out.println("Formula F");

        //Declaración de variables
        double valorMF;
        double valorNF;
        double valorPF;

        double resultadoF;

        //Ingreso de datos
        System.out.print("Ingrese el valor de M: ");
        valorMF = scan.nextDouble();
        System.out.print("Ingrese el valor de N: ");
        valorNF = scan.nextDouble();
        System.out.print("Ingrese el valor de P: ");
        valorPF = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoF = (valorMF / valorNF) + valorPF;
        System.out.println("Resultado: " + resultadoF);

        System.out.println("");

        //Formula G
        System.out.println("Formula G");

        //Declaración de variables
        double valorMG;
        double valorNG;
        double valorPG;
        double valorQG;

        double resultadoG;

        //Ingreso de datos
        System.out.print("Ingrese el valor de M: ");
        valorMG = scan.nextDouble();
        System.out.print("Ingrese el valor de N: ");
        valorNG = scan.nextDouble();
        System.out.print("Ingrese el valor de P: ");
        valorPG = scan.nextDouble();
        System.out.print("Ingrese el valor de Q: ");
        valorQG = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoG = valorMG + (valorNG / (valorPG - valorQG));
        System.out.println("Resultado: " + resultadoG);

        System.out.println("");

        //Formula H
        System.out.println("Formula H");

        //Declaración de variables
        double valorAH;
        double valorBH;
        double valorCH;
        double valorDH;

        double resultadoH;

        //Ingreso de datos
        System.out.print("Ingrese el valor de A: ");
        valorAH = scan.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        valorBH = scan.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        valorCH = scan.nextDouble();
        System.out.print("Ingrese el valor de D: ");
        valorDH = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoH = ((valorAH * valorAH) / (valorBH * valorBH)) + ((valorCH * valorCH) / (valorDH * valorDH));
        System.out.println("Resultado: " + resultadoH);

        System.out.println("");

        //Formula I
        System.out.println("Formula I");

        //Declaración de variables
        double valorMI;
        double valorNI;
        double valorPI;
        double valorQI;
        double valorRI;
        double valorSI;

        double resultadoI;

        //Ingreso de datos
        System.out.print("Ingrese el valor de M: ");
        valorMI = scan.nextDouble();
        System.out.print("Ingrese el valor de N: ");
        valorNI = scan.nextDouble();
        System.out.print("Ingrese el valor de P: ");
        valorPI = scan.nextDouble();
        System.out.print("Ingrese el valor de Q: ");
        valorQI = scan.nextDouble();
        System.out.print("Ingrese el valor de R: ");
        valorRI = scan.nextDouble();
        System.out.print("Ingrese el valor de S: ");
        valorSI = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoI = (valorMI + (valorNI / valorPI)) / (valorQI - (valorRI / valorSI));
        System.out.println("Resultado: " + resultadoI);

        System.out.println("");

        //Formula J
        System.out.println("Formula J");

        //Declaración de variables
        double valorAJ;
        double valorBJ;
        double valorCJ;
        double valorDJ;
        double valorEJ;
        double valorFJ;
        double valorGJ;
        double valorHJ;

        double resultadoJ;

        //Ingreso de datos
        System.out.print("Ingrese el valor de A: ");
        valorAJ = scan.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        valorBJ = scan.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        valorCJ = scan.nextDouble();
        System.out.print("Ingrese el valor de D: ");
        valorDJ = scan.nextDouble();
        System.out.print("Ingrese el valor de E: ");
        valorEJ = scan.nextDouble();
        System.out.print("Ingrese el valor de F: ");
        valorFJ = scan.nextDouble();
        System.out.print("Ingrese el valor de G: ");
        valorGJ = scan.nextDouble();
        System.out.print("Ingrese el valor de H: ");
        valorHJ = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoJ = ((3 * valorAJ) + valorBJ) / (valorCJ - (valorDJ + (5 * valorEJ)) / (valorFJ + (valorGJ / (2 * valorHJ))));
        System.out.println("Resultado: " + resultadoJ);

        System.out.println("");

        //Formula K
        System.out.println("Formula K");

        //Declaración de variables
        double valorAK;
        double valorBK;
        double valorXK;

        double resultadoK;

        //Ingreso de datos
        System.out.print("Ingrese el valor de A: ");
        valorAK = scan.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        valorBK = scan.nextDouble();
        System.out.print("Ingrese el valor de X: ");
        valorXK = scan.nextDouble();

        //Cálculo e impresión de resultado
        resultadoK = ((valorAK*valorAK)+(2*valorAK*valorBK)+(valorBK*valorBK))/((1/valorXK*valorXK)+2);
        System.out.println("Resultado: " + resultadoK);
    }
}
