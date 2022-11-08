/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02variableauxiliar;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class Ej02VariableAuxiliar {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingresa 4 numeros para 4 variables:");
        int a = leer.nextInt(), b = leer.nextInt(), c = leer.nextInt(), d = leer.nextInt();
        
        mostrarVariables(a,b,c,d);
        
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("Las variables se han intercambiado. Míra!");
        mostrarVariables(a,b,c,d);
    } //main
    
    public static void mostrarVariables(int a, int b, int c, int d){
        System.out.println("La variables A vale "+a+".");
        System.out.println("La variables B vale "+b+".");
        System.out.println("La variables C vale "+c+".");
        System.out.println("La variables D vale "+d+".");
        System.out.println("");
    } //mostrarVariables

} //class
