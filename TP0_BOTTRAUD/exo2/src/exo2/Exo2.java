/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaration des variables
int nb; // nombre d entiers a additionner int result; 
int ind;//indice
int result;// resultat
nb=5;
result=0;
ind=1;
        Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier


while (ind <= nb) {
               result=result+ind;// Addition des nb premiers entiers
             }
             // Affichage du resultat
             System.out.println();
             System.out.println("La somme des "+ nb + "entiers est: "+result);



             
    }
    
}
