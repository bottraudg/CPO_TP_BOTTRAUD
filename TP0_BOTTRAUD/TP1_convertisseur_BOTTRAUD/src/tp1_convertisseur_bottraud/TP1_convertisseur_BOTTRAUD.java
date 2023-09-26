/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bottraud;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP1_convertisseur_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cel;
        double kel;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);// initialisation du scanner
    System.out.println("Entrez la temperature en Celsius:");
    cel = sc.nextDouble();//stockage de la 1ere valeur réelle dans var1 
    
    // CONVERTION CELCIUS VERS KELVIN
    kel= cel+273.15;
    System.out.println("temperature en kelvin: " + kel);
    
    }
     
}
    

