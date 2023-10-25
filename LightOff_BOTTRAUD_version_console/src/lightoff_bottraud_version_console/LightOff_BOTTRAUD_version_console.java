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
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        cellule1.etatCellule();
        System.out.println(cellule1);

        cellule1.activerCellule();
        System.out.println(cellule1);

        cellule1.eteindreCellule();
        System.out.println(cellule1);

        cellule2.estEteint();
        System.out.println(cellule1);

        cellule1.getEtat();
        System.out.println(cellule1);
        


    }

}
