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
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int number = 0;
        int counter = 0;
        int n3;
        int n4;
        int n5;
        int diff = 0;
        int x = 100; //represente la valeur max que peut avoir 
        int max = 100; // represente la nombre de coup autorise pour faire le jeu
        Random generateurAleat = new Random();
        n = generateurAleat.nextInt(100);
        n3 = generateurAleat.nextInt(100);
        n4 = generateurAleat.nextInt(100);
        n5 = generateurAleat.nextInt(100);

        System.out.println("Choisir la difficulté");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        
        diff = sc.nextInt(); //demande pour choisir la difficulté du jeu
        
        
        while (diff > 3 || diff < 1) {
            System.out.println("ERREUR La valeur n'est pas comprise entre 1 et 3");
            System.out.println("Choisir la difficulté");
            diff = sc.nextInt(); //boucle tant que diff n est pas entre 1 et 3 afin d avoir un programme associe
        }
        
        
        
        switch (diff) {
            case 1 -> {
                System.out.println("tu as 100 coups pour trouver le nombre");
            }//facile
            case 2 -> {
                max = 5;
                System.out.println("tu as 5 coups pour trouver le nombre");
            }//moyen
            case 3 -> {
                x = 100;
                max = 20;
                System.out.println("tu as 20 coups pour trouver le nombre");
            }//difficile
        }
        do {
            if (max == 0) {
                System.out.println("Tu n'as plus de coup");
                break; //si max =0 il n y a plus de coup
            }
            if (number < n) {
                System.out.println("trop petit");
                number = sc.nextInt(); //trop petit
            }
            if (number > n) {
                System.out.println("trop grand");
                number = sc.nextInt(); //trop grand
            }
            counter++;
        
            max -= 1;//on enleve le droit de 1 coup
        } while (number != n); //tant que nb different de alea
        if (number == n) { //si c est juste
            System.out.println( "exact en " + counter + " coups");
        }
        
        }


}