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
public void eteindreToutesLesCellules() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[i][j].eteindreCellule();
        }
    }
}
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                result.append(matriceCellules[i][j].estAllumee() ? "1" : "0");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        GrilleDeCellules grille = new GrilleDeCellules(5, 5);
        System.out.println(grille.toString());

        grille.melangerMatriceAleatoirement(10);
        System.out.println(grille.toString());
    }
}
