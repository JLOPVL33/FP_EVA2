/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_19_MENU {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String menu[];
        int precios[];
        Scanner captura = new Scanner(System.in);
        int cantidad;
        System.out.println("Cuantos productos tendrá el menu");
        cantidad = captura.nextInt();
        menu = new String[cantidad];
        precios = new int[cantidad];
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre del producto: ");
        }
        
    }
}
