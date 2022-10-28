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
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");// création d'un constructeur, donc les instructions d’affectation des attributs de la question 7 sont désormais obsolètes   
        uneBiere.lireEtiquette();
//uneBiere.nom = "Cuvée des trolls"; 
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = " Dubuisson ";
        //uneBiere.ouverte = false;
        //uneBiere.lireEtiquette();

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
    }

    {
        BouteilleBiere uneBiere1 = new BouteilleBiere("mort subite", 5.5, "Brasserie De Keersmaeker");
        uneBiere1.lireEtiquette();

        BouteilleBiere uneBiere2 = new BouteilleBiere("heineken", 5, "Brasserie Heineken");
        uneBiere2.lireEtiquette();

        BouteilleBiere uneBiere3 = new BouteilleBiere("goudale", 7.2, "Brasserie Jeanne D'arc");
        uneBiere3.lireEtiquette();

        System.out.println(uneBiere.ouverte);
        boolean Decapsuler = uneBiere.Decapsuler();
        System.out.println(uneBiere.ouverte);
        System.out.println(uneBiere);

        System.out.println(uneBiere1);
        System.out.println(uneBiere2);
        System.out.println(uneBiere3);
    }

    
    }

