/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author guilenebottraud
 */
public class Guerrier extends Personnage  {
   
    private boolean cheval;
    
    public Guerrier (String nomPerso, int nivVie, boolean cheval){
        this.nomPerso=nomPerso;
        this.nivVie= nivVie;
        this.cheval= cheval;
    }
    public void setCheval(boolean cheval){
    this.cheval=cheval;
}
}
