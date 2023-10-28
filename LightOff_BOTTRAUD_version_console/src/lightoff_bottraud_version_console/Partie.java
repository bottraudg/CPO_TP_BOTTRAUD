/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bottraud_version_console;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class Partie {

    private GrilleDeCellules grille;
    private int nbCoups;

    public Partie() {
        grille = new GrilleDeCellules(5, 5); // Crée une nouvelle grille de 5x5
        nbCoups = 0;
    }

    /**
     * permet d'initialiser le jeu c'est-à-dire de préparer le plateau de jeu
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(50); // Mélange la grille pour l'initialiser
    }

    /**
     * Lance la partie en demandant au joueur de choisir ligne colonne ou diago
     */
    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Grille actuelle :");
            System.out.println(grille.toString());

            // Demander au joueur de saisir un coup
            // Manière de jouer : choisir entre ligne colonne et diagonale, puis si colonne ou ligne a été choisi
            // choisir par la suite un chiffre entre 0 et nbLignes (pareil pour les colonnes avec nbColonnes). si diagonale a etait choisi 
            //choisir descendante ou montante  
            System.out.println("Entrez un coup (ligne, colonne ou diagonale) :");
            String coup = scanner.nextLine();// enter ligne ou colonne ou diagonale

            
            if (coup.equalsIgnoreCase("ligne")) {
                System.out.println("Quelle ligne voulez vous activer ? ");

                int ligne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                grille.activerLigneDeCellules(ligne);

            } else if (coup.equalsIgnoreCase("colonne")) {
                 System.out.println("Quelle colonne voulez vous activer ? ");
                 
                 
                int colonne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                grille.activerColonneDeCellules(colonne); 
                
                
            } else if (coup.equalsIgnoreCase("diagonale")) {
                System.out.println ( "Quelle diagonale voulez vous activer, montante ou descendante");
                String diagonale = scanner.nextLine();// rentrer montante ou descendante
                if (diagonale.equalsIgnoreCase("montante")){
                    grille.activerDiagonaleDescendante();
                }else{
                    grille.activerDiagonaleMontante();
                }
            } else {
                System.out.println("Coup invalide, veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");
                continue; // Répéter le tour
            }

            nbCoups++;
            System.out.println("Nombre de coups joués : " + nbCoups);
        }

        System.out.println("Toutes les cellules sont éteintes en " + nbCoups + " coups.");
    }

}
