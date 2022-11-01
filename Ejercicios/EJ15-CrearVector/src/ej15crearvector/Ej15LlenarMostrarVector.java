/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ej15crearvector;

/**
 * @author Motherfucker
 */
public class Ej15LlenarMostrarVector {
    
    public static void mostrarVector(int[] vector, int d) {
        for (int i = d; i > 0; i--) {
            System.out.println(vector[i-1]);
        }
    } 
    
    public static void main(String[] args) {
        int[] vector100 = new int[100];
        for (int i = 0; i < 100; i++) {
            vector100[i] = i+1;
        }
        mostrarVector(vector100, 100);
    }
    
}