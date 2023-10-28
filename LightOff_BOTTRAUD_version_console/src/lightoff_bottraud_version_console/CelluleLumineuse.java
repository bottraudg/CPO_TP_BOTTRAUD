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

    public CelluleLumineuse(boolean par) {
    }

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
    
    /**
     * Permet d'allumer la cellule
     * @return
     */
    public boolean activerCellule(){
        if (etat=false){
            etat = true;
            
        }else{
            etat = false; 
            
        }
        return etat;
    }
    
    /**
     * Permet d'eteindre la cellule
     * @return
     */
    public boolean eteindreCellule(){
        if (etat = true){
            etat = false;
        }
        return etat;
    }
    
    /**
     * Permet de verifier l'etat de la cellule, ici voir si elle est eteinte 
     * @return
     */
    public boolean estEteint(){
       return etat = false;
    }
    
    /**
     *Permet de verifier l'etat de la cellule, ici voir si elle est eteinte 
     * @return
     */
    public boolean estAllumee(){
       return etat=true;
    }

    /**
     * Permet simplement de verifier l'etat de la cellule, ce qui nous donnera soit activée soit eteinte
     * @return
     */
    public boolean getEtat(){
        return etat;
        
    }
    
    /**
     * Permet d'avoir des X et O dans les cellules et non les references objets ce qui rend la lecture plus simple 
     * @return
     */
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
