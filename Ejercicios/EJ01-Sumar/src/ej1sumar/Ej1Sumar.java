/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1sumar;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej1Sumar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 2 números a sumar:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma de los 2 números es " + (num1+num2) + ".");
    }
    
}