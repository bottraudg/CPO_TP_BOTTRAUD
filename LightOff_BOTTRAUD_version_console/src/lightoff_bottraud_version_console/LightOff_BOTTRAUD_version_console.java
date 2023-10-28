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
        
        CelluleLumineuse cellule1 = new CelluleLumineuse(false);// création d'une cellule "cellule1"
        CelluleLumineuse cellule2 = new CelluleLumineuse(true);//  création d'une cellule "cellule2"
        GrilleDeCellules grilleTest = new GrilleDeCellules(5, 5);// création d'une grille test 
        Partie partie = new Partie(); // Crée une instance de la classe Partie
        partie.initialiserPartie();// appele de la methode initialiser partie 
        partie.lancerPartie(); // Appelle la méthode lancerPartie pour commencer le jeu

        cellule1.activerCellule();
        System.out.println(cellule1);

        cellule2.eteindreCellule();
        System.out.println(cellule2);

        cellule2.estEteint();
        System.out.println(cellule2);

        cellule1.getEtat();
        System.out.println(cellule1);

        grilleTest.activerLigneColonneOuDiagonaleAleatoire();

        grilleTest.melangerMatriceAleatoirement(3);

        System.out.println("Grille initiale :");
        System.out.println(grilleTest.toString());

        grilleTest.activerLigneDeCellules(2);
        System.out.println("Après activation d'une ligne :");
        System.out.println(grilleTest.toString());

        grilleTest.activerColonneDeCellules(3);
        System.out.println("Après activation d'une colonne :");
        System.out.println(grilleTest.toString());

        grilleTest.activerDiagonaleDescendante();
        System.out.println("Après activation de la diagonale descendante :");
        System.out.println(grilleTest.toString());

        grilleTest.activerDiagonaleMontante();
        System.out.println("Après activation de la diagonale montante :");
        System.out.println(grilleTest.toString());

        grilleTest.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Après activation aléatoire :");
        System.out.println(grilleTest.toString());

        grilleTest.melangerMatriceAleatoirement(10);
        System.out.println("Après mélange aléatoire :");
        System.out.println(grilleTest.toString());

    }

}
