/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01minutosadiass;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej01MinutosADias {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     *
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingresa los minutos a transformar en dias y horas:");
        int min = leer.nextInt();
        int hora = (int)(min/60);
        int dias = (int)(hora/24);
        hora -= (dias*24);
        int minR = min-(hora*60)-(dias*24*60);
        System.out.println(min+" minutos son "+dias+" dias, "+hora+" horas, "+minR+" minutos.");
    }

}
