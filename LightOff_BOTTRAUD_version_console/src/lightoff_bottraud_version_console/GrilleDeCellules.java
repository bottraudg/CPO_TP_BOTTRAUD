/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bottraud_version_console;

import java.util.Random;

/**
 *
 * @author guilenebottraud
 */
public class GrilleDeCellules {

    private CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     *initialisation de la grille de jeu sous forme de tableau dont la taille peut etre regler grace à nbLignes et nbColonnes
     * @param nbLignes
     * @param nbColonnes
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la grille avec des cellules éteintes
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse(false);
            }
        }
    }

    /**
     * Permet d'eteindre toutes les cellules 
     */
    public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].eteindreCellule();
        }
    }
}

    /**
     * permet d'activer (c'est a dire les allumer) les lignes une par une des cellules 
     * @param idLigne numero de la ligne 
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbLignes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     *permet d'activer (c'est a dire les allumer) les colonnes une par une des cellules 
     * @param idColonne numero de la colonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     *Permet d'activer (c'est a dire allumer) la diagonale descendante (de gauche à droite) une par une des cellules 
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     *Permet d'activer (c'est a dire allumer) la diagonale montante (de gauche à droite) une par une des cellules 
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    /**
     * Permet d'activer (allumer) une ligne ou une colonne ou une diagonnales de manière aléatoire 
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4);

        switch (choix) {
            case 0:
                activerLigneDeCellules(random.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(random.nextInt(nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }
    
    /**
     * Permet de verifier l'état des cellules, plus précisement si elles sont toutes eteintes
     * @return
     */
    public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].estAllumee()) {
                return false; // Si au moins une cellule est allumée, retourne false
            }
        }
    }
    return true; // Si aucune cellule n'est allumée, retourne true
}
    
    /**
     * Permet de melanger aléatoirement la matrice
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int action = random.nextInt(5);

            switch (action) {
                case 0:
                    activerLigneDeCellules(random.nextInt(nbLignes));
                    break;
                case 1:
                    activerColonneDeCellules(random.nextInt(nbColonnes));
                    break;
                case 2:
                    activerDiagonaleDescendante();
                    break;
                case 3:
                    activerDiagonaleMontante();
                    break;
                case 4:
                    activerLigneColonneOuDiagonaleAleatoire();
                    break;
            }
        }
    }

    /**
     * Permet de rendre la grille plus estetique, avec des "|" qui rendre la lecture plus facile 
     * @return
     */
    @Override
 
    public String toString() {
        String chaine = "   |";
        for (int i=0;i<nbLignes;i++){
                chaine+= " "+i+" |";
        }
       
        chaine += "\n";
       
        for (int i=0;i<nbLignes+1;i++){
            chaine+= "----";
        }
       
        chaine += "\n";
           
        for (int j=0;j<nbLignes;j++){
            chaine+= " "+j+" |";
            for (int k=0;k<nbColonnes;k++){
                chaine+=" "+matriceCellules[j][k].toString()+" |";
            }
            chaine += "\n";
            for (int i=0;i<nbLignes+1;i++){
            chaine+= "----";
            }
            chaine += "\n";
        }
       
        return chaine;
    }
}
