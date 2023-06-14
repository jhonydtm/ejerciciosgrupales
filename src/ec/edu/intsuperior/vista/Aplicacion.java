/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author jhony
 */
public class Aplicacion {
      public static void main(String[]args) {
        numerosTerminadosEnDos();
    }
            
    public static void numeroParImpar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = leer.nextInt();
        if (n % 2 == 0) {
            System.out.println("El numero :" + n + " es un numero par");
        } else {
            System.out.println("El numero :" + n + " es un numero impar");
        }
    }
    public static void cantidadDeDigitos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = sc.nextInt();
        System.out.println("El numero es " + n);
        int cantidad = 0;
        while (n > 0) {
            n = n/10;
            cantidad++;
        }
        System.out.println("La cantidad de digitos que tiene es " + cantidad);
    }
    public static void multiplosDeCinco() {
        System.out.println("Multiplos de 5 entre el rango de 1 a 100");
        for(int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void numerosTerminadosEnDos() {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        do {
            System.out.print("Introduce un número (introduce un número negativo para terminar): ");
            num = sc.nextInt();

            if (num >= 0 && num % 10 == 2) {
                count++;
            }
        } while (num >= 0);

        System.out.println("Se han leído " + count + " números acabados en 2.");
    }
  


    
}
