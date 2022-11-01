/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10dowhilelimite;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author Motherfucker
 */
public class Ej10DoWhileLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un límite numérico entero para las sumas:");
        int limit = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingresa un número entero a sumar:");
            int num = leer.nextInt();
            while (num < 1){
                System.out.println("El número ingresado debe ser un entero positivo, intenta nuevamente:");
                num = leer.nextInt();
            }
            suma = suma + num;
            System.out.println("La suma ahora es " + suma + ".");
        } while (suma <= limit);
    }
    
}