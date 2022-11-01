/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9substring;

import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 * @author Motherfucker
 */
public class Ej9Substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase que comienze con A:");
        String frase = leer.next();
        if (frase.toLowerCase().substring(0,1).equals("a")) {
            System.out.println("Corresto");
        } else {
            System.out.println("Incorresto");
        }
    }
    
}