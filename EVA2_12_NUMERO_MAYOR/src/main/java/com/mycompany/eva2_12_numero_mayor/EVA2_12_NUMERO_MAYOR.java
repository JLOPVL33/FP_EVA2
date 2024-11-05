/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_numero_mayor;
import java.util.Scanner;
/**
 *
 * @author Jennifer
 */
public class EVA2_12_NUMERO_MAYOR {

    public static void main(String[] args) {
        String texto;
     System.out.println("Ingrese un texto:");
     Scanner cap = new Scanner (System.in);
     texto=cap.nextLine();
     
       for (int i = 0; i <= texto.length(); i++){ 
            char letra = texto.charAt(i);
           
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
            System.out.println("Numero de vocales" + i);
            }
       }}}
