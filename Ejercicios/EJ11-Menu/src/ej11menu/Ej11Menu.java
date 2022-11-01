/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11menu;

import java.util.Scanner;

/*
 * @author Motherfucker
 */
public class Ej11Menu {

    /**
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
* 
    MENU
  1. Sumar
  2. Restar
  3. Multiplicar
  4. Dividir
  5. Salir
  Elija opción:
* 
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 2 números enteros positivos a operar:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opc;
        
        do {
        System.out.println("Menú: Que desea hacer con los números?");
        System.out.println(" 1. Sumar");
        System.out.println(" 2. Restar");
        System.out.println(" 3. Multiplicar");
        System.out.println(" 4. Dividir");
        System.out.println(" 5. Salir");
        System.out.println("");
        System.out.println("Elija la opción deseada:");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("La suma de " + num1 + " + " +  num2 + " es " + (num1+num2) + ".");
                continue;
            case 2:
                System.out.println("La resta de " + num1 + " - " +  num2 + " es " + (num1-num2) + ".");
                continue;
            case 3:
                System.out.println("La multiplicación de " + num1 + " * " +  num2 + " es " + (num1*num2) + ".");
                continue;
            case 4:
                System.out.println("La división de " + num1 + " / " +  num2 + " es " + (num1/num2) + ".");
                continue;
            case 5:
                System.out.println("Está seguro de que desea salir del programa? (s/n)");
                String confirma = leer.next();
                if (confirma.toLowerCase().equals("s")){
                    System.out.println("Adios humano! Gracias por utilizar la calculadora.");
                    break;
                } else if (confirma.toLowerCase().equals("n")){
                    continue;
                } else {
                    System.out.println("Opción incorrecta.");
                }
            default:
                System.out.println("Opción incorrecta. Fijate!");
        }
        } while (opc != 5);
    }
    
}
