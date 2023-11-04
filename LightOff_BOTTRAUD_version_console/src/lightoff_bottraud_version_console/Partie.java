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
    int difficulte;
    Scanner scanner;

    /**
     * Ce constructeur permet de contruire la grille en fonction de la difficulté choisie
     */
    public Partie() {
        //grille = new GrilleDeCellules(2, 2); // Crée une nouvelle grille de 5x5
        //nbCoups = 0;
        //int difficulte = 0;
        scanner = new Scanner(System.in);
        while (difficulte == 0) {
            System.out.println("Choisisez un niveau ( facile/ moyen/ difficile ) : ");

            niveau = scanner.nextLine();
            int nbCellule = 0;
            // NIVEAU FACILE 
            if (niveau.equalsIgnoreCase("facile")) {
                //grille = new GrilleDeCellules(3, 3); // Crée une nouvelle grille de 5x5
                nbCellule = 3;
                difficulte = 100;
            }
            if (niveau.equalsIgnoreCase("moyen")) {
                //grille = new GrilleDeCellules(4, 4); // Crée une nouvelle grille de 5x5
                nbCellule = 4;
                difficulte = 50;
            }
            if (niveau.equalsIgnoreCase("difficile")) {
                nbCellule = 5;
                //grille = new GrilleDeCellules(5, 5); // Crée une nouvelle grille de 5x5

                difficulte = 10;
            }
            
            grille = new GrilleDeCellules(nbCellule, nbCellule); // Crée une nouvelle grille de 5x5
        }
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
       

        System.out.println("Bienvenue dans le jeu LightOff!");

        //while (!grille.cellulesToutesEteintes()) {
        //System.out.println("Grille actuelle :");
        //System.out.println(grille.toString());

        // Demander au joueur de saisir un coup
        // Manière de jouer : choisir entre ligne colonne et diagonale, puis si colonne ou ligne a été choisi
        // choisir par la suite un chiffre entre 0 et nbLignes (pareil pour les colonnes avec nbColonnes). si diagonale a etait choisi 
        //choisir descendante ou montante  
        //boolean victoire = false;
        

        //}
        for (int i = 0; i < difficulte; i++) {
            System.out.println(grille);
            if (grille.cellulesToutesEteintes()) {
                System.out.println("C'est gagné");
                victoire = true;
                break;
            }
            System.out.println("Il reste " + String.valueOf(difficulte - i) + " coups");
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

//while(nbCoups<100 ){

/* System.out.println(grille.toString());
                     System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
                  coup = scanner.nextLine();// enter ligne ou colonne ou diagonale
                    // ACTIONS SUR LIGNE
                    if (coup.equalsIgnoreCase("ligne")) {
                System.out.println("Quelle ligne voulez vous activer ? ");

                int ligne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                grille.activerLigneDeCellules(ligne);
                //ACTION DUR COLONNE
            } else if (coup.equalsIgnoreCase("colonne")) {
                 System.out.println("Quelle colonne voulez vous activer ? ");
                 
                 
                int colonne = scanner.nextInt();// rentrer un chiffre entre 0 et nbLigne
                grille.activerColonneDeCellules(colonne); 
                
                // ACTION SUR DIAGONALE 
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
                //continue; // Répéter le tour
            }
                    System.out.println(nbCoups);
                    nbCoups ++;
                //}
                     
                    // NIVEAU MOYEN 
                }else if (niveau.equalsIgnoreCase("moyen")){ 
             
                while(nbCoups<10 ){
                    System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
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
               
                }
                // NIVEAU DIFFICILE
            }else if (niveau.equalsIgnoreCase("difficile")){
                
            
            
            
                while(nbCoups<5 ){// nombre de coups limité à 5 coups 
                    System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
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
                
                }}

            }

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
