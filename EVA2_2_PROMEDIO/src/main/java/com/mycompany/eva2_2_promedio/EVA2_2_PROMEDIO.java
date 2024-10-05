/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int califa, acum;
        Scanner captura = new Scanner(System.in);
        acum = 0;
        System.out.println("INTRODUCE LA CALIFICACIÓN;");
        califa = captura.nextInt();
        captura.nextLine();
        
        for(int i = 1; i <= 20; i++){
            System.out.println("Estudiante#" + i);
            System.out.println("Introduce la calificación: ");
            califa = captura.nextInt();
            captura.nextLine();
            acum = acum + califa;            
        }
        System.out.println("Promedio = " + (acum / 20.0));
        
    }
}
