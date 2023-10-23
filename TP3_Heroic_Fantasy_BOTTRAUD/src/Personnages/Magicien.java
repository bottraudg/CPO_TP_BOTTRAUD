/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author guilenebottraud
 */
public class Magicien extends Personnage {
    boolean confirme;
    
    public Magicien (String nomPerso, int nivVie, boolean confirme){
        this.nomPerso=nomPerso;
        this.nivVie= nivVie;
        this.confirme= confirme;
        
    }
}
