/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_bottraud;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guilenebottraud
 */
public class TP1_stats_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        float var = 0;
        float face1 = 0; // on initialise une variable pour la face 1
        float face2 = 0;
        float face3 = 0;
        float face4 = 0;
        float face5 = 0;
        float face6 = 0;
        int n;

        float tab[] = new float[6]; // création d'un tableau pour mettre les pourcentages obtenu pour les 6 faces
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisissez le nombre de lancé de dé ");
        m = sc.nextInt(); // on récupère le nombre de dé lancé
        while (var != m) { // création d'une boucle, tant que le nombre de coup décidé par l'utilisateur n'est pas atteint, on lance le dé
            Random generateurAleat = new Random();
            n = generateurAleat.nextInt(5); // on génère un nombre aléatoire pour le lancé de dé
            System.out.println(n);
if (n == 0){
              face1++;
            }
            if (n == 1){
              face2++;
            }
            if (n == 2){
              face3++;
            }
            if (n == 3){
              face4++;
            }
            if (n == 4){
              face5++;
            }
            if (n == 5){
              face6++;
            }
            var++;
        } // fin while 
        
        tab[0] = (face1*100)/m; // on converti le nombre de coup en pourcentage 
        tab[1] = (face2*100)/m;
        tab[2] = (face3*100)/m;
        tab[3] = (face4*100)/m;
        tab[4] = (face5*100)/m;
        tab[5] = (face6*100)/m;
        }// fin main 

    
}// class 
