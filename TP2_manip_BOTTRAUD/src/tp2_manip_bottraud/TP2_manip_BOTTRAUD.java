/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bottraud;

/**
 *
 * @author guilenebottraud
 */
public class TP2_manip_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        // Moussaka assiette666 = assiette1 ; 
        // Moussaka assiette667 = new Tartiflette() ;
        // une référence objet qui annonce référencer un type d’objet peut-elle en référencer un autre qui n’a aucun rapport ?
        // non une tartiflette ne peux pas devenir une moussaka 
        
        Moussaka tab[] = new Moussaka[10]; // tableau de moussaka vide de 10 places
        for (int i = 0; i < 9; i++) { //bloucle
            Moussaka a = new Moussaka(); //creer des moussakas
            tab[i]=a; //le met dans le tableau
            System.out.println(tab[i]); //pour comprendre le tableau
        }
    }// fin main 
 
}
