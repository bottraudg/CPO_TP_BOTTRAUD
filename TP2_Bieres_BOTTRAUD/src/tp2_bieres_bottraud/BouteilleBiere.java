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
public double degreAlcool;
    String brasserie;
public boolean ouverte;
//cette méthode permet d'afficher les informations 
 public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
 }
 //permet de pouvoir creer des constructeurs avec la même base 
 public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { 
   nom = unNom;
   degreAlcool = unDegre;
   brasserie = uneBrasserie;
   ouverte = false;
}
 //permet de savoir si la bière est décapsulée
        public boolean Decapsuler(){ //Q12
            if (ouverte==false){
                ouverte=true;
                System.out.println("erreur: bière deja ouverte");
                return true; 
            }else{
                   System.out.println("bière pas ouverte");
                   return false;

        
            }
        }
 
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " " + degreAlcool + " degrès ouverte ?";
    if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
    }
    }

