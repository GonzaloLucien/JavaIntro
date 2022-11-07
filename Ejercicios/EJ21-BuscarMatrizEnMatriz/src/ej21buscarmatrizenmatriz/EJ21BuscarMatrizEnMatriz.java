/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21buscarmatrizenmatriz;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class EJ21BuscarMatrizEnMatriz {

    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
     * se debe verificar si entre todas las submatrices de 3x3 que se pueden
     * formar en la matriz M, desplazándose por filas o columnas, existe al
     * menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P.
     *
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        rellenarMatrizM(matrizM);
        mostrarMatriz(matrizM, 10);
        rellenarMatrizP(matrizP);
        mostrarMatriz(matrizP, 3);

        if (pruebaContiene(matrizM, matrizP)) {
            System.out.println("Por lo tanto, la matriz P está contenida en la matriz M.");
        } else {
            System.out.println("La buscamos y no está.");
        }
    } //Main

    public static void rellenarMatrizM(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    } //RellenarMatrizM

    public static void mostrarMatriz(int[][] matriz, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }
    } //MostrarMatriz

    public static void rellenarMatrizP(int[][] matrizP) {
        System.out.println("Ingrese los 9 numeros de la matriz P: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = leer.nextInt();
            }
        }
    } //RellenarMatrizP

    public static boolean pruebaContiene(int[][] matrizG, int[][] matrizP) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizG[i][j] == matrizP[0][0]) {
                    if (compruebaSubMatriz(matrizG, matrizP, i, j)) {
                        System.out.println("La matriz comienza en la fila " + (i + 1) + ", columna " + (j + 1) + ".");
                        return true;
                    }
                }
            }
        }
        return false;
    } //PruebaContiene

    public static boolean compruebaSubMatriz(int[][] matrizG, int[][] matrizP, int f, int c) {
        int fP = 0;
        int cP;
        for (int i = f; i < f + 3; i++) {
            cP = 0;
            for (int j = c; j < c + 3; j++) {
                if (matrizG[i][j] != matrizP[fP][cP]) {
                    return false;
                }
                cP++;
            }
            fP++;
        }
        return true;
    } //CompruebaSubMatriz

}//Class
