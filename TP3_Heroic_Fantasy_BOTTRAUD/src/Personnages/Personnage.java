/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author guilenebottraud
 */
public abstract class Personnage {
     String nomPerso;
    int nivVie;
    String ArmePortee = null;
    
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
   public void armePortee(){
        System.out.println("voici les armes disponibles, laquelle voulez vous choisir? \n");
        for (int i =0; i < this.armesPossedes.size(); i++ ){
            System.out.println("("+ i + ") " + this.armesPossedes.elementAt(i)); 
    }
      Scanner choix = new Scanner(System.in);
      int armeAjoutee = choix.nextInt();
      Arme nomPerso;
      
   }
     @Override
    public String toString () {                             // méthode string 
        return "nom du personnage: " + nomPerso + ", Niveau de vie: " + nivVie;
    }
    
    
}