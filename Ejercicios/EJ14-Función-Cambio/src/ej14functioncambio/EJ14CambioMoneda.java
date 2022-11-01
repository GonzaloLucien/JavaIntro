/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14functioncambio;

import java.util.Scanner;

/**
 *
 * @author Motherfucker
 */
public class EJ14CambioMoneda {

    /**
     Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de euros a convertir:");
        Double euro = leer.nextDouble();
        System.out.println("Ingresa la moneda a la que quieres convertirlo:");
        System.out.println("Escriba: dolares, yenes o libras:");
        Boolean correcto;
        String moneda;
        do {
            moneda = leer.next();
            correcto = moneda.equals("dolares")||moneda.equals("yenes")||moneda.equals("libras");
            if (!correcto){
                System.out.println("Moneda incorrecta, intentá denuevo salamín con pan.");  
            }
        } while (!correcto);
        cambio(euro, moneda);
    }
   public static void cambio(Double euro, String money) {
       switch (money) {
           case "libras":
               System.out.println(euro+" euros son "+(0.86*euro)+" libras.");
               break;
            case "dolares":
               System.out.println(euro+" euros son "+(1.28611*euro)+" dólares.");
               break;
            default:
               System.out.println(euro+" euros son "+(129.852*euro)+" yenes.");
   }
   }
}
