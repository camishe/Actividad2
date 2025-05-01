//Capitulo dos
package com.mycompany.badnames;

import java.util.Scanner;

/**
 * @author Mishelle Nuñez
 */
public class BadNames {

    // Arreglo donde guardaremos hasta 10 números
    private int[] numero = new int[10];   // Arreglo de numero hasta 10
    private int contador = 0;               // contador de numeros agregados

    // Método: agrega un número al arreglo
    public void agregar(int valor) {
        numero[contador++] = valor;            
    }

    // Método: calculo de la suma
    public int suma() {
        int sumar = 0;                   
        for (int j = 0; j < contador; j++) {
            sumar += numero[j];
        }
        return sumar;
    }

    // Método: promedio de los números guardados
    public double promedio() {
        return contador == 0 ? 0 : (double) suma() / contador;
    }

    // Pequeña interfaz de consola para ejecutar y probar
    public static void main(String[] args) {
        BadNames numeros = new BadNames();               
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos numeros ingresara? ");
        int total = scanner.nextInt();                      

        for (int k = 0; k < total; k++) {              // “k” -> contador genérico
            System.out.print("Numero: ");
            numeros.agregar(scanner.nextInt());
        }

        System.out.println("Suma = " + numeros.suma());
        System.out.println("Promedio = " + numeros.promedio());
        scanner.close();
    }
}
