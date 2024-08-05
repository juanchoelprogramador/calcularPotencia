/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.potencia;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Potencia {
    
    public static double calcularPotencia(double n1, double n2){
        return Math.pow(n1, n2);
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double numero1 = lector.nextDouble();
        double numero2 = lector.nextDouble();
        double respuesta = calcularPotencia(numero1, numero2);
        System.out.println("La potencia es " + respuesta);
    }
}
