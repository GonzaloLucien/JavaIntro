/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16buscarenvector;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej16BuscarEnVector {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
     * @param args the command line arguments
     */
    
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) { 
        System.out.println("Ingresa un tamaño para el vector:");
        int dim = leer.nextInt();
        int[] vect = new int[dim];
        llenarVector(vect, dim);
        mostrarVector(vect, dim);
        encontrarNumero(vect, dim);
    }
    
    public static void llenarVector(int[] vector, int d){
        for (int i = 0; i < d; i++) {
            vector[i] = (int) (Math.random()*10);
        }
    }
    
    public static void mostrarVector(int[] vector, int d) {
        for (int i = 0; i < d; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }
    
    public static void encontrarNumero(int[] vector, int d) {
        System.out.println("Ingresa el número entero que quieres buscar en el vector:");
        int num = leer.nextInt();
        int suma = 0;
        for (int i = 0; i < d; i++) {
            if (vector[i]==num) {
                System.out.println("El número "+num+" se encuentra en la posición "+i+" del vector");
                suma+=1;
            }
        }
        if (suma>=2) {
            System.out.println("Tu número está repetido "+suma+" veces.");
        } else if (suma==0) {
            System.out.println("Tu número no está en el vector, pelotudo.");
        } else {
            System.out.println("Tu número se repite una vez.");
        }
    }
}