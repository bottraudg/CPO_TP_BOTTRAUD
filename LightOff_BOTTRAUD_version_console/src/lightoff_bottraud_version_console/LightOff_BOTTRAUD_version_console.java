/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_bottraud_version_console;

/**
 *
 * @author guilenebottraud
 */
public class LightOff_BOTTRAUD_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1 = new CelluleLumineuse(false);
        CelluleLumineuse cellule2 = new CelluleLumineuse(true);

        cellule1.etatCellule();
        System.out.println(cellule1);

        cellule1.activerCellule();
        System.out.println(cellule1);

        cellule2.eteindreCellule();
        System.out.println(cellule1);

        cellule2.estEteint();
        System.out.println(cellule1);

        cellule1.getEtat();
        System.out.println(cellule1);

        GrilleDeCellules grille = new GrilleDeCellules(5, 5);
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(0);
        System.out.println("Grille initiale :");
        System.out.println(grille.toString());

        grille.activerLigneDeCellules(2);
        System.out.println("Après activation d'une ligne :");
        System.out.println(grille.toString());

        grille.activerColonneDeCellules(3);
        System.out.println("Après activation d'une colonne :");
        System.out.println(grille.toString());

        grille.activerDiagonaleDescendante();
        System.out.println("Après activation de la diagonale descendante :");
        System.out.println(grille.toString());

        grille.activerDiagonaleMontante();
        System.out.println("Après activation de la diagonale montante :");
        System.out.println(grille.toString());

        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Après activation aléatoire :");
        System.out.println(grille.toString());

        grille.melangerMatriceAleatoirement(10);
        System.out.println("Après mélange aléatoire :");
        System.out.println(grille.toString());

       
        
        
    }

}
