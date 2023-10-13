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
    //déclaration des variables 
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    //methode lire etique qui permet seulement d'afficher les éléments 
    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}
    
    //methode qui permet de stocker les éléments qui caractérise la biere 
      public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
   
}
   
     //methode qui decapsule
    public void Décapsuler() { 
        if (ouverte == false) {
            ouverte = true;
        }
    } 
    @Override
    // methode qui retourne la chaine de caractère que l’on veut afficher quand l’objet est cité
public String toString() {
   String chaine_a_retourner;
   chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}
