/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._exa_2;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Piedra, Papel o Tijeras");
        String[] opciones = {"Piedra", "Papel", "Tijera"};
           Scanner captura = new Scanner(System.in);
        int victoriasJugador = 0;
        int victoriasComputadora = 0;
        int Empate = 0;
        while (true) {
            System.out.println("Piedra = 1, Papel = 2, Tijera = 3"); 
            System.out.println("Para salir ponga 0");
            int jugador = captura.nextInt();           
            if (jugador == 0) {               
            System.out.println("Gana el jugador: " + victoriasJugador);    
            System.out.println("Ganó la computadora: " + victoriasComputadora);
            System.out.println(" ");
            System.out.println("Empate:" + Empate);
            System.out.println(" ");
            System.out.println("Gracias por jugar!!!");             
                break;
            }
            if (jugador < 1 || jugador > 3) {
                System.out.println("INvalido elegir un numero del 1 al 3");
                  System.out.println(" ");
                continue;
            }          
            int computadora = (int) (Math.random() * 3) + 1; 
            System.out.println("Su elección " + opciones[jugador - 1]);
            System.out.println("La elección contaria: " + opciones[computadora - 1]);       
            if (jugador == computadora) {
                System.out.println("Es un empate!");
                Empate++;
            } else if ((jugador == 1 && computadora == 3) || 
                       (jugador == 2 && computadora == 1) || 
                       (jugador == 3 && computadora == 2)) {               
                System.out.println("Ganaste!!");
                victoriasJugador++;
            } else {
                System.out.println("Tu oponente gano!!");
                
                victoriasComputadora++;
            }
    }
    }
}
