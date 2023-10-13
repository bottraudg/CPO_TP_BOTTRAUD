/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bottraud;

/**
 *
 * @author guilenebottraud
 */
public class TP2_Bieres_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1ere biere 
      BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
      uneBiere.lireEtiquette();
      // seconde biere 
       BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
      secondeBiere.lireEtiquette();
      
  
   
    
    
    
    BouteilleBiere B3 = new BouteilleBiere("Delirium Tremens", (float) 8.5,"Brasserie Huyghe") ;
        B3.Décapsuler(); //methode  decapsuler 
        BouteilleBiere B2 = new BouteilleBiere("Rince cochon", (float) 8.5,"Brasserie Rince Cochon") ;
        BouteilleBiere B1 = new BouteilleBiere("BMB Blanche", (float) 5.6,"Brasserie Mont Blanc") ;
        B1.Décapsuler();//methode  decapsuler
        
        System.out.println(B1 + "\n" + B2 + "\n" + B3); //permet de lire avec toString()
    }// fin du main 
    
}
