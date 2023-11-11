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
    //private int nbCoups = 0;
    String coup = null;
    boolean victoire;
    String niveau;
    int difficulte;// nombre de coups disponibles 
    Scanner scanner;

    /**
     * Ce constructeur permet de contruire la grille en fonction de la difficulté choisie
     */
    public Partie() {
        //grille = new GrilleDeCellules(2, 2); // Crée une nouvelle grille de 2x2
        System.out.println("Bienvenue dans le jeu LightOff!");
        scanner = new Scanner(System.in);
        while (difficulte == 0) {
            System.out.println("Choisisez un niveau ( facile/ moyen/ difficile ) : ");

            niveau = scanner.nextLine();
            int nbCellule = 0;
            // NIVEAU FACILE 
            if (niveau.equalsIgnoreCase("facile")) {
                //grille = new GrilleDeCellules(3, 3); // Crée une nouvelle grille de 5x5 
                // AUTRE METHODE, QUI DEMANDE PLUS D'ÉCRITURE, ECRIRE "grille = new GrilleDeCellules(3, 3);" POUR CHAQUE NIVEAU ( pareil pour le niveau moyen et difficile)
                nbCellule = 3; // taille de la grille - matrice 
                difficulte = 50;
            }
            if (niveau.equalsIgnoreCase("moyen")) {
                //grille = new GrilleDeCellules(4, 4); // Crée une nouvelle grille de 5x5
                nbCellule = 4;// taille de la grille / matrice 
                difficulte = 50;
            }
            if (niveau.equalsIgnoreCase("difficile")) {
                nbCellule = 5;// taille de la grille / matrice 
                //grille = new GrilleDeCellules(5, 5); // Crée une nouvelle grille de 5x5

                difficulte = 10;
            }
            
            grille = new GrilleDeCellules(nbCellule, nbCellule); // Crée une nouvelle grille à taille variable 
        }
    }

    /**
     * Permet d'initialiser le jeu c'est-à-dire de préparer le plateau de jeu
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(50); // Mélange la grille pour l'initialiser
    }

    /**
     * Lance la partie en demandant au joueur de choisir ligne colonne ou diago
     */
    public void lancerPartie() {
        initialiserPartie();
       

        
// CES LIGNES NE SONT PLUS UTILES CAR LA TAILLE DE GRILLE CHANGE EN FONCTION DU NIVEAU 
        //while (!grille.cellulesToutesEteintes()) {
        //System.out.println("Grille actuelle :");
        //System.out.println(grille.toString());

        /* ||METHODE DE JEU||
        1. Choisir le niveau de jeu entre facile (50 coups et matrice 3/3); moyen (50 coups et matrice 4/4); difficile (10 coups et matrice 5/5)
        2. Choisir entre ligne colonne et diagonale
        2.1. Si colonne ou ligne a été choisi : choisir par la suite un chiffre entre 0 et nbLignes (pareil pour les colonnes avec nbColonnes)
        2.2. Si diagonale a etait choisi : choisir descendante ou montante  
        */
        
        
        
        for (int i = 0; i < difficulte; i++) {
            System.out.println(grille);
            if (grille.cellulesToutesEteintes()) {
                System.out.println("C'est gagné");
                victoire = true; 
                break;// arret de la boucle while si toute les cellules sont allumées 
            } 
            
            System.out.println("Il reste " + String.valueOf(difficulte - i) + " coups");// donne le nombres de coups restants 
            System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
            scanner.reset();
            coup = scanner.nextLine();// enter ligne ou colonne ou diagonale
            switch (coup) {
                case "ligne":
                    System.out.println("Quelle ligne voulez vous activer ? ");

                    int ligne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                    scanner.nextLine();
                    grille.activerLigneDeCellules(ligne);
                    break;
                case "colonne":
                    System.out.println("Quelle colonne voulez vous activer ? ");

                    int colonne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                    scanner.nextLine();
                    grille.activerColonneDeCellules(colonne);
                    break;
                case "diagonale":
                    System.out.println("Quelle diagonale voulez vous activer, montante ou descendante");
                    String diagonale = scanner.nextLine();// rentrer montante ou descendante
                    if (diagonale.equalsIgnoreCase("descendante")) {
                        grille.activerDiagonaleDescendante();
                    } else {
                        grille.activerDiagonaleMontante();
                    }
                    break;
                default:
                    System.out.println("Coup invalide, veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");
                    i--;
            }
        }
        if (!victoire) {
            System.out.println("Tu as perdu.");
        }
    }

}

            // CODE QUI PERMET DE FAIRE FAIRE FONCTIONNER LE JEU SANS NIVEAUX 

            /* if (coup.equalsIgnoreCase("ligne")) {
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
        }*/
//System.out.println("Toutes les cellules sont éteintes en " + nbCoups + " coups.");
//}

    //} 
