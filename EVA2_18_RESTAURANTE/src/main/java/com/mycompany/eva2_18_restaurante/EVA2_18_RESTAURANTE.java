/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_18_RESTAURANTE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String menu[] = {"Dogos", "Hamburgesa", "Boneless", "Tacos",
        "Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        Scanner captura = new Scanner(System.in);
        int cantidad, producto;
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
    }
        System.out.println("Cual es tu orden? (introduce el numero del producto");
        producto = captura.nextInt();
        captura.nextLine();
        System.out.println("Cuantas ordenes?");
        cantidad = captura.nextInt();
        captura.nextLine();
        System.out.println("El costo es de = $" + cantidad * precios[producto] );
    }
}
