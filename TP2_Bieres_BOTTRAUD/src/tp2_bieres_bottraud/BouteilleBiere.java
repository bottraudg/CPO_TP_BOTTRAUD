/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bottraud;

/**
 *
 * @author guilenebottraud
 */
 
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

 public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
 }
 public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) { // permet de pouvoir creer des constructeurs avec la même base 
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
}
 }   
 

