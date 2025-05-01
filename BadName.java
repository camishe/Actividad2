//capitulo tres
package com.mycompany.badname;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class BadName {

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
    BadName numeros = new BadName();
    Scanner scanner = new Scanner(System.in);

    int cantidad = pedirCantidad(scanner);
    leerNumeros(scanner, numeros, cantidad);
    mostrarResultados(numeros);

    scanner.close();
}

    // Solicita al usuario la cantidad de números a ingresar
    private static int pedirCantidad(Scanner scanner) {
        System.out.print("Cuantos numeros ingresara? ");
    return scanner.nextInt();
    }

    // Lee los números ingresados por el usuario
    private static void leerNumeros(Scanner scanner, BadName numeros, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero: ");
            int numero = scanner.nextInt();
            numeros.agregar(numero);
        }
    }

    // Muestra la suma y el promedio de los números
    private static void mostrarResultados(BadName numeros) {
        System.out.println("Suma = " + numeros.suma());
        System.out.println("Promedio = " + numeros.promedio());
    }
}

