/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_11_VALIDAR_2 {

    public static void main(String[] args) {
        int diass;
        Scanner cap = new Scanner(System.in);

         while (true) {
            System.out.println("Captura el numero de dia de la semana (1 a 7):");
            diass = cap.nextInt();

            if (diass >= 1 && diass <= 7) {
                break;
            } else {
                System.out.println("NÚMERO DE MES INCORRECTO!!!");
            }
        }

        if (diass == 1) {
            System.out.println("Domingo");
        } else if (diass == 2) {
            System.out.println("Lunes");
        } else if (diass == 3) {
            System.out.println("Martes");
        } else if (diass == 4) {
            System.out.println("Miércoles");
        } else if (diass == 5) {
            System.out.println("Jueves");
        } else if (diass == 6) {
            System.out.println("Viernes");
        } else if (diass == 7) {
            System.out.println("Sábado");
        }}}
