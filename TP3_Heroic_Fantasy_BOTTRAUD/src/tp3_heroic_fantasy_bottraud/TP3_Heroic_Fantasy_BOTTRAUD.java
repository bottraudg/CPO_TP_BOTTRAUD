/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_bottraud;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import java.util.Vector;

/**
 *
 * @author guilenebottraud
 */
public class TP3_Heroic_Fantasy_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme epee1 = new Epee("Excalibur", 7, 5);
        Arme epee2 = new Epee("Durandal", 4, 7);

        Arme baton1 = new Baton("Chêne", 4, 5);
        Arme baton2 = new Baton("Charme", 5, 6);

        Vector tabArme = new Vector();
        tabArme.add(epee1);
        tabArme.add(epee2);

        tabArme.add(baton1);
        tabArme.add(baton2);

        for (int i = 0; i < tabArme.size(); i++) {
            System.out.println(tabArme.elementAt(i));
        }

        Personnage mag1 = new Magicien("Gandalf", 65, true);
        Personnage mag2 = new Magicien("Garcimore", 44, false);

        Personnage guer1 = new Guerrier("Conan", 78, false);
        Personnage guer2 = new Guerrier("Lannister", 45, true);
      
        Vector tabPerso = new Vector(); // création du tableau dynamique pour les personnages 
        tabArme.add(mag1);
        tabArme.add(mag2);

        tabArme.add(guer1);
        tabArme.add(guer2);

        for (int i = 0; i < tabPerso.size(); i++) {
            System.out.println(tabPerso.elementAt(i));
        }
    }

}
