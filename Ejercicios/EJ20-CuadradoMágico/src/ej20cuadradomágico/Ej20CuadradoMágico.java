/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20cuadradomágico;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej20CuadradoMágico {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     *
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mMagica = new int[3][3];

        System.out.println("Ingresa los 9 valores de la matriz mágica:");

        llenarMatriz(mMagica);
        if (compMagica(mMagica)) {
            System.out.println("Es una matriz Mágica!");
        } else {
            System.out.println("Lo siento, no es una matriz mágica.");
        }
    } //main

    public static void llenarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila " + i + ", columna " + j + ":");
                matriz[i][j] = leer.nextInt();
            }
        }
    } //llenarMatriz

    public static boolean compMagica(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            suma += matriz[0][i];
        }

        if (!compFilas(matriz, suma)) {
            return false;
        } else if (!compColumnas(matriz, suma)) {
            return false;
        }
        return compDiag(matriz, suma);

    } //comproMagica

    public static boolean compFilas(int[][] matriz, int sum) {
        int sumF;

        for (int i = 1; i < 3; i++) {
            sumF = 0;
            for (int j = 0; j < 3; j++) {
                sumF += matriz[i][j];
            }
            if (sum != sumF) {
                return false;
            }
        }

        return true;
    } //compFilas

    public static boolean compColumnas(int[][] matriz, int sum) {
        int sumC;

        for (int i = 0; i < 3; i++) {
            sumC = 0;
            for (int j = 0; j < 3; j++) {
                sumC += matriz[j][i];
            }
            if (sum != sumC) {
                return false;
            }
        }

        return true;
    } //compColumnas

    public static boolean compDiag(int[][] matriz, int sum) {
        int sumD1 = 0;
        int sumD2 = 0;
        int invertida = 2;

        for (int i = 0; i < 3; i++) {
            sumD1 += matriz[i][i];
        }
        if (sum != sumD1) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            sumD2 += matriz[i][invertida];
            invertida--;
        }

        return sum == sumD2;

    } //compDiag
} //class
