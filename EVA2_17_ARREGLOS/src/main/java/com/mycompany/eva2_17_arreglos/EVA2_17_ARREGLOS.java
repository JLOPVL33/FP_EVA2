/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos;

/**
 *
 * @author Jennifer
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String diasemana[] = {"Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes", "Sabado", "Domingo"};
        int valores[] = {20, 50, 100, 200, 500, 1000};
        for (int i = 0; i < diasemana.length; i++){
            System.out.print(diasemana[i] + " - ");
            
        }
        System.out.println("");
        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " - ");
        }
    }
}
