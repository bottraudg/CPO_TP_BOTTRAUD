/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.Vector;

/**
 *
 * @author guilenebottraud
 */
public abstract class Personnage {
     String nomPerso;
    int nivVie;
    String ArmePortee;
    
    public int NiveaudeVie(){
        return nivVie;
        
    }
    public String NomPersonnage(){
        return nomPerso;
    }
    Vector armesPossedes = new Vector ();
    public boolean addArme (){
        if (armesPossedes.size() == 5){
            return false;
        }
        else{
            return true;
        }
        
    }
   
    
    
}