/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int base, expo;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce la base;");
        base = captura.nextInt();
        System.out.println("Introduce el exponente:");
        expo = captura.nextInt();
        captura.nextLine();
        System.out.println("Potencia = " + Math.pow(base, expo) );
        int acum = 1;
        for(int i = 1; i <= expo; i++){
    }
        System.out.println("Potencia = " + acum);
        
    }
}
