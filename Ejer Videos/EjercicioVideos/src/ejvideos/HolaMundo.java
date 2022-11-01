/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejvideos;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola bro! Ingresa tu nombre:");
        String name = leer.next();
        System.out.println("Hola mundo! Dice " + name + ".");
    }
    
}