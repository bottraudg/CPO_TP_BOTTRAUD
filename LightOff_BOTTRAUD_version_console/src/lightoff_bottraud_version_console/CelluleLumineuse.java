/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bottraud_version_console;

/**
 *
 * @author guilenebottraud
 */
public class CelluleLumineuse {
   private boolean etat =false;// initialisation à éteinte 
    
    /**
     *
     * @return
     */
    public boolean etatCellule(){
        if (etat = false ){
            return false;
        }else{
            return false;
        }
    }
    
    
    public boolean activerCellule(){
        if (etat=false){
            etat = true;
            
        }else{
            etat = false; 
            
        }
        return etat;
    }
    
    public boolean eteindreCellule(){
        if (etat = true){
            etat = false;
        }
        return etat;
    }
    
    public boolean estEteint(){
        if (etat = false){
            return true;
        }else{
            return false;
        }
    }
    public boolean getEtat(){
        return etat;
        
    }
    
    @Override
    public String toString () {    // méthode string 
        String allume;
        if (etat=false){
            return "X";
        }else{
            return "O";
        }
    }
    
    
    
    
    
}
