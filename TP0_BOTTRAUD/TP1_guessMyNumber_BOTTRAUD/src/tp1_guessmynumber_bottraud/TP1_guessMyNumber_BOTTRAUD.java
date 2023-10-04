/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_bottraud;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP1_guessMyNumber_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random generateurAleat = new Random();
       int n = generateurAleat.nextInt(100);
       System.out.println(n);
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
     if (number<n ) {
         System.out.println(" trop petit ");
     }   
     if (number>n ) {
         System.out.println(" trop grand ");
     }
     if (number == n ) {
         System.out.println(" gagné ");
     }
     while (number != n) {
         System.out.println(number);
         number=number;
         
     }
    }
    
}
