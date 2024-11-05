/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_continue;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA2_6_CONTINUE {

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            if((i % 2)>0)
                continue;
            System.out.print(i+" - ");
        }
        System.out.println("");
        for (int i = 1; i <=10; i++){
            if((i % 2)==0)
                continue;
            System.out.print(i+" - ");

    }
}}
