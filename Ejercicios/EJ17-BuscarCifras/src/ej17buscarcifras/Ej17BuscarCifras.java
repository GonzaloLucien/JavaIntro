/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17buscarcifras;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej17BuscarCifras {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Decime cuantos valores querés en tu vector:");
        int num = leer.nextInt();
        int[] vector = new int[num];
        llenarVector(vector, num);
        mostrarVector(vector, num);
        buscarDigitos(vector, num);
    }
    
    public static void llenarVector(int[] vector, int d){
        int min = 1;
        int max = 100000;
        for (int i = 0; i < d; i++) {
            vector[i] = (int) (Math.random()*(max-min+1)+min);
        }
    }
    
    public static void mostrarVector(int[] vector, int d) {
        for (int i = 0; i < d; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
    
    public static void buscarDigitos(int[] vect, int d) {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        int digitos;
        for (int i = 0; i < d; i++) {
            digitos = (int)(Math.log10(vect[i])+1);
            switch (digitos){
                case 1:
                    sum1 ++;
                    break;
                case 2:
                    sum2 ++;
                    break;
                case 3:
                    sum3 ++;
                    break;
                case 4:
                    sum4 ++;
                    break;
                case 5:
                    sum5 ++;
                    break;
            } 
            
        }
        System.out.println("Hay " + sum1 + " números de 1 dígito en el vector.");
        System.out.println("Hay " + sum2 + " números de 2 dígito en el vector.");
        System.out.println("Hay " + sum3 + " números de 3 dígito en el vector.");
        System.out.println("Hay " + sum4 + " números de 4 dígito en el vector.");
        System.out.println("Hay " + sum5 + " números de 5 dígito en el vector.");
    }

}
